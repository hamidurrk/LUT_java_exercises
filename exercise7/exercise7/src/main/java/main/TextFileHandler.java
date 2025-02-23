package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileHandler implements FileHandler {

    @Override
    public void saveItems(String filename, List<Item> items) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Item item : items) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    writer.write("BOOK;" + book.getId() + ";" + book.getTitle() + ";" + book.getAuthor());
                } else if (item instanceof DVD) {
                    DVD dvd = (DVD) item;
                    writer.write("DVD;" + dvd.getId() + ";" + dvd.getTitle() + ";" + dvd.getDuration());
                }
                writer.newLine();
            }
        }
    }

    @Override
    public List<Item> loadItems(String filename) throws IOException {
        List<Item> loadedItems = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 4) {
                    String type = parts[0];
                    String id = parts[1];
                    String title = parts[2];
                    String extra = parts[3];
                    
                    if (type.equalsIgnoreCase("BOOK")) {
                        loadedItems.add(new Book(id, title, extra));
                    } else if (type.equalsIgnoreCase("DVD")) {
                        try {
                            int duration = Integer.parseInt(extra);
                            loadedItems.add(new DVD(id, title, duration));
                        } catch (NumberFormatException e) {
                            continue;
                        }
                    }
                }
            }
        }
        return loadedItems;
    }
}

