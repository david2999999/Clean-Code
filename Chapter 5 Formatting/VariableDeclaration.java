// Variable Declarations. Variables should be declared as close to their usage as possible.
// Because our functions are very short, local variables should appear a the top of each
// function, as in this longish function from Junit4.3.1.

private static void readPreferences() {
    InputStream is= null;
    try {
        is= new FileInputStream(getPreferencesFile());
        setPreferences(new Properties(getPreferences()));
        getPreferences().load(is);
    } catch (IOException e) {
        try {
            if (is != null)
                is.close();
        } catch (IOException e1) { }
    }
}