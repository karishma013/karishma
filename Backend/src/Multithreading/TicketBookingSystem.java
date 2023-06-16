package Backend.src.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketBookingSystem {
    private int availableTickets;
    private Lock lock;

    public TicketBookingSystem(int availableTickets) {
        this.availableTickets = availableTickets;
        this.lock = new ReentrantLock();
    }

    public void bookTicket(int requestedTickets) {
        lock.lock();
        try {
            if (requestedTickets <= availableTickets) {
                System.out.println(Thread.currentThread().getName() + " is booking " + requestedTickets + " tickets.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                availableTickets -= requestedTickets;
                System.out.println(Thread.currentThread().getName() + " successfully booked " + requestedTickets + " tickets.");
                System.out.println("Available tickets: " + availableTickets);
            } else {
                System.out.println(Thread.currentThread().getName() + " cannot book " + requestedTickets + " tickets. Not enough available tickets.");
            }
        } finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(20);


        Thread thread1 = new Thread(() -> bookingSystem.bookTicket(3));
        Thread thread2 = new Thread(() -> bookingSystem.bookTicket(9));
        Thread thread3 = new Thread(() -> bookingSystem.bookTicket(5));
        Thread thread4 = new Thread(() -> bookingSystem.bookTicket(7));


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
