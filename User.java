    /*
     *  This is an interface class that the player and playground owner,
     * entered and can update their details.
     */
    package main;

    /**
     *
     * @author OWNER
     */
    interface User {
        public void UpdateName(String name);
        public void UpdateEmail(String email);
        public void UpdatePassword(String password);
        public void UpdateLocation(String location);
        public void UpdatePhone(String phone);
    }
