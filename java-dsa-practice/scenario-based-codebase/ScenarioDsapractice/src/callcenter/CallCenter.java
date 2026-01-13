package callcenter;

import java.util.*;

public class CallCenter {
	// normal queue for calls
    private Queue<Customer> normalQueue = new LinkedList<>();
    
    //priority calls for vip customers
    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>(Comparator.comparing(Customer::getCustomerId));
    
    // HashMap to track number of calls
    private HashMap<String, Integer> callCountMap = new HashMap<>();
    
    
    // Add incoming call
    public void receiveCall(Customer customer) {

        if (customer.isVIP()) {
            vipQueue.offer(customer);
        } else {
            normalQueue.offer(customer);
        }

        // Update call count
        String id = customer.getCustomerId();
        callCountMap.put(id, callCountMap.getOrDefault(id, 0) + 1);
    }
    
    // Handle next call
    public void handleNextCall() {
        if (!vipQueue.isEmpty()) {
            Customer c = vipQueue.poll();
            System.out.println("Handling VIP customer: " + c.getCustomerId());
        } else if (!normalQueue.isEmpty()) {
            Customer c = normalQueue.poll();
            System.out.println("Handling normal customer: " + c.getCustomerId());
        } else {
            System.out.println("No calls waiting");
        }
    }
    
    // Display call count
    public void displayCallCounts() {
        System.out.println("\nCustomer Call Count:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
