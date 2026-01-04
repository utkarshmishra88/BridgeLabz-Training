package com.linkedlist.moviemgmt;

class MovieDoublyLinkedList {

    private Movie head;
    private Movie tail;

    // 1️⃣ Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2️⃣ Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 3️⃣ Add at specific position (1-based index)
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        Movie newNode = new Movie(title, director, year, rating);

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // 4️⃣ Remove movie by title
    public void removeByTitle(String title) {
        if (head == null) return;

        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // 5️⃣ Search by director
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found for director: " + director);
        }
    }

    // 6️⃣ Search by rating
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found with rating: " + rating);
        }
    }

    // 7️⃣ Update rating by title
    public void updateRating(String title, double newRating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // 8️⃣ Display forward
    public void displayForward() {
        Movie temp = head;

        if (temp == null) {
            System.out.println("No movie records available");
            return;
        }

        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // 9️⃣ Display reverse
    public void displayReverse() {
        Movie temp = tail;

        if (temp == null) {
            System.out.println("No movie records available");
            return;
        }

        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Helper method
    private void displayMovie(Movie m) {
        System.out.println(
                "Title: " + m.title +
                ", Director: " + m.director +
                ", Year: " + m.year +
                ", Rating: " + m.rating
        );
    }
}

