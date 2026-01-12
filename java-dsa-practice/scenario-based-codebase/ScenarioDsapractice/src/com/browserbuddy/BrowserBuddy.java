package com.browserbuddy;
import java.util.Stack;
public class BrowserBuddy {
    private static BrowserTab currentTab = new BrowserTab();
    private static Stack<BrowserTab> closedTabs = new Stack<>();

    // Close current tab
    public static void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new BrowserTab();
        System.out.println("Tab closed");
    }

    // Restore last closed tab
    public static void restoreTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Tab restored");
        } else {
            System.out.println("No closed tabs to restore");
        }
    }

    public static void main(String[] args) {

        currentTab.visit("google.com");
        currentTab.visit("youtube.com");
        currentTab.visit("github.com");

        currentTab.showHistory();     

        currentTab.back();
        System.out.println(currentTab.getCurrentPage()); // youtube.com

        currentTab.forward();
        System.out.println(currentTab.getCurrentPage()); // github.com

        closeTab();        // close current tab
        restoreTab();      // reopen last closed tab

        currentTab.showHistory();
    }
}