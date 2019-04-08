public class TestTarget {

    public static Object[][] latestChrome = new Object[][] {
            new Object[]{"chrome", "63.0", "Windows 10"},
            new Object[]{"chrome", "63.0", "macOS 10.13"}
    };

    public static Object[][] latestOnly = new Object[][] {
            new Object[]{"firefox", "58.0", "Windows 10"},
            new Object[]{"chrome", "63.0", "Windows 10"},
            new Object[]{"firefox", "58.0", "macOS 10.13"},
            new Object[]{"chrome", "63.0", "macOS 10.13"}
    };

    public static Object[][] fullRegression = new Object[][]{
            new Object[]{"MicrosoftEdge", "latest", "Windows 10"},
            new Object[]{"MicrosoftEdge", "latest-1", "Windows 10"},
            new Object[]{"MicrosoftEdge", "latest-2", "Windows 10"},
            new Object[]{"MicrosoftEdge", "latest-3", "Windows 10"},
            new Object[]{"MicrosoftEdge", "latest-4", "Windows 10"},
            new Object[]{"internet explorer", "latest", "Windows 10"},
            new Object[]{"firefox", "latest", "Windows 10"},
            new Object[]{"firefox", "latest-1", "Windows 10"},
            new Object[]{"firefox", "latest-2", "Windows 10"},
            new Object[]{"firefox", "latest-3", "Windows 10"},
            new Object[]{"firefox", "latest-4", "Windows 10"},
            new Object[]{"firefox", "latest-5", "Windows 10"},
            new Object[]{"firefox", "latest-6", "Windows 10"},
            new Object[]{"firefox", "latest-7", "Windows 10"},
            new Object[]{"firefox", "latest-8", "Windows 10"},
            new Object[]{"firefox", "latest-9", "Windows 10"},
            new Object[]{"firefox", "latest-10", "Windows 10"},
            new Object[]{"chrome", "latest", "Windows 10"},
            new Object[]{"chrome", "latest-1", "Windows 10"},
            new Object[]{"chrome", "latest-2", "Windows 10"},
            new Object[]{"chrome", "latest-3", "Windows 10"},
            new Object[]{"chrome", "latest-4", "Windows 10"},
            new Object[]{"chrome", "latest-5", "Windows 10"},
            new Object[]{"chrome", "latest-6", "Windows 10"},
            new Object[]{"chrome", "latest-7", "Windows 10"},
            new Object[]{"chrome", "latest-8", "Windows 10"},
            new Object[]{"chrome", "latest-9", "Windows 10"},
            new Object[]{"chrome", "latest-10", "Windows 10"},

            new Object[]{"internet explorer", "latest", "Windows 8.1"},
            new Object[]{"firefox", "latest", "Windows 8.1"},
            new Object[]{"firefox", "latest-1", "Windows 8.1"},
            new Object[]{"firefox", "latest-2", "Windows 8.1"},
            new Object[]{"firefox", "latest-3", "Windows 8.1"},
            new Object[]{"firefox", "latest-4", "Windows 8.1"},
            new Object[]{"firefox", "latest-5", "Windows 8.1"},
            new Object[]{"firefox", "latest-6", "Windows 8.1"},
            new Object[]{"firefox", "latest-7", "Windows 8.1"},
            new Object[]{"firefox", "latest-8", "Windows 8.1"},
            new Object[]{"firefox", "latest-9", "Windows 8.1"},
            new Object[]{"firefox", "latest-10", "Windows 8.1"},
            new Object[]{"chrome", "latest", "Windows 8.1"},
            new Object[]{"chrome", "latest-1", "Windows 8.1"},
            new Object[]{"chrome", "latest-2", "Windows 8.1"},
            new Object[]{"chrome", "latest-3", "Windows 8.1"},
            new Object[]{"chrome", "latest-4", "Windows 8.1"},
            new Object[]{"chrome", "latest-5", "Windows 8.1"},
            new Object[]{"chrome", "latest-6", "Windows 8.1"},
            new Object[]{"chrome", "latest-7", "Windows 8.1"},
            new Object[]{"chrome", "latest-8", "Windows 8.1"},
            new Object[]{"chrome", "latest-9", "Windows 8.1"},
            new Object[]{"chrome", "latest-10", "Windows 8.1"},

            new Object[]{"internet explorer", "latest", "Windows 8"},
            new Object[]{"firefox", "latest", "Windows 8"},
            new Object[]{"firefox", "latest-1", "Windows 8"},
            new Object[]{"firefox", "latest-2", "Windows 8"},
            new Object[]{"firefox", "latest-3", "Windows 8"},
            new Object[]{"firefox", "latest-4", "Windows 8"},
            new Object[]{"firefox", "latest-5", "Windows 8"},
            new Object[]{"firefox", "latest-6", "Windows 8"},
            new Object[]{"firefox", "latest-7", "Windows 8"},
            new Object[]{"firefox", "latest-8", "Windows 8"},
            new Object[]{"firefox", "latest-9", "Windows 8"},
            new Object[]{"firefox", "latest-10", "Windows 8"},
            new Object[]{"chrome", "latest", "Windows 8"},
            new Object[]{"chrome", "latest-1", "Windows 8"},
            new Object[]{"chrome", "latest-2", "Windows 8"},
            new Object[]{"chrome", "latest-3", "Windows 8"},
            new Object[]{"chrome", "latest-4", "Windows 8"},
            new Object[]{"chrome", "latest-5", "Windows 8"},
            new Object[]{"chrome", "latest-6", "Windows 8"},
            new Object[]{"chrome", "latest-7", "Windows 8"},
            new Object[]{"chrome", "latest-8", "Windows 8"},
            new Object[]{"chrome", "latest-9", "Windows 8"},
            new Object[]{"chrome", "latest-10", "Windows 8"},

            new Object[]{"internet explorer", "latest", "Windows 7"},
            new Object[]{"internet explorer", "latest-1", "Windows 7"},
            new Object[]{"internet explorer", "latest-2", "Windows 7"},
            new Object[]{"firefox", "latest", "Windows 7"},
            new Object[]{"firefox", "latest-1", "Windows 7"},
            new Object[]{"firefox", "latest-2", "Windows 7"},
            new Object[]{"firefox", "latest-3", "Windows 7"},
            new Object[]{"firefox", "latest-4", "Windows 7"},
            new Object[]{"firefox", "latest-5", "Windows 7"},
            new Object[]{"firefox", "latest-6", "Windows 7"},
            new Object[]{"firefox", "latest-7", "Windows 7"},
            new Object[]{"firefox", "latest-8", "Windows 7"},
            new Object[]{"firefox", "latest-9", "Windows 7"},
            new Object[]{"firefox", "latest-10", "Windows 7"},
            new Object[]{"chrome", "latest", "Windows 7"},
            new Object[]{"chrome", "latest-1", "Windows 7"},
            new Object[]{"chrome", "latest-2", "Windows 7"},
            new Object[]{"chrome", "latest-3", "Windows 7"},
            new Object[]{"chrome", "latest-4", "Windows 7"},
            new Object[]{"chrome", "latest-5", "Windows 7"},
            new Object[]{"chrome", "latest-6", "Windows 7"},
            new Object[]{"chrome", "latest-7", "Windows 7"},
            new Object[]{"chrome", "latest-8", "Windows 7"},
            new Object[]{"chrome", "latest-9", "Windows 7"},
            new Object[]{"chrome", "latest-10", "Windows 7"}

    };

    public static Object[][] chromeFirefoxPreviousFive = new Object[][]{

            new Object[]{"firefox", "58.0", "Windows 10"},
            new Object[]{"chrome", "63.0", "Windows 10"},
            new Object[]{"chrome", "64.0", "Windows 10"},
            new Object[]{"firefox", "57.0", "Windows 10"},
            new Object[]{"firefox", "56.0", "Windows 10"},
            new Object[]{"chrome", "62.0", "Windows 10"},
            new Object[]{"firefox", "55.0", "Windows 10"},
            new Object[]{"chrome", "61.0", "Windows 10"},
            new Object[]{"firefox", "54.0", "Windows 10"},
            new Object[]{"chrome", "60.0", "Windows 10"},
            new Object[]{"firefox", "53.0", "Windows 10"},
            new Object[]{"chrome", "59.0", "Windows 10"},
            new Object[]{"firefox", "52.0", "Windows 10"},
            new Object[]{"chrome", "57.0", "Windows 10"},
            new Object[]{"firefox", "51.0", "Windows 10"},
            new Object[]{"chrome", "56.0", "Windows 10"},
            new Object[]{"firefox", "50.0", "Windows 10"},
            new Object[]{"chrome", "55.0", "Windows 10"},
            new Object[]{"firefox", "58.0", "macOS 10.13"},
            new Object[]{"chrome", "58.0", "macOS 10.13"},
            new Object[]{"firefox", "57.0", "macOS 10.13"},
            new Object[]{"chrome", "57.0", "macOS 10.13"},
            new Object[]{"firefox", "56.0", "macOS 10.13"},
            new Object[]{"chrome", "56.0", "macOS 10.13"},
            new Object[]{"firefox", "55.0", "macOS 10.13"},
            new Object[]{"chrome", "55.0", "macOS 10.13"},
            new Object[]{"firefox", "54.0", "macOS 10.13"},
            new Object[]{"chrome", "54.0", "macOS 10.13"},
            new Object[]{"firefox", "58.0", "macOS 10.14"},
            new Object[]{"chrome", "58.0", "macOS 10.14"},
            new Object[]{"firefox", "57.0", "macOS 10.14"},
            new Object[]{"chrome", "57.0", "macOS 10.14"},
            new Object[]{"firefox", "56.0", "macOS 10.14"},
            new Object[]{"chrome", "56.0", "macOS 10.14"},
            new Object[]{"firefox", "55.0", "macOS 10.14"},
            new Object[]{"chrome", "55.0", "macOS 10.14"},
            new Object[]{"firefox", "54.0", "macOS 10.14"},
            new Object[]{"chrome", "54.0", "macOS 10.14"}

    };


}