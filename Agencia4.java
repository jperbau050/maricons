import java.util.ArrayList;

public class Agencia4 {

    private ArrayList<Contact> contacts;

    public Agencia4() {
        contacts = new ArrayList<>();
        loadContacts();
    }

    private void loadContacts() {
        contacts.add(new Contact("Juan", "123456789"));
        contacts.add(new Contact("Ana", "987654321"));
        contacts.add(new Contact("Carlos", "456789123"));
    }

    public void showContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + ": " + contact.getPhone());
        }
    }

    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
    }

    public static void main(String[] args) {
        Agencia4 agencia = new Agencia4();
        agencia.showContacts();
    }

    public static class Contact {
        private String name;
        private String phone;

        public Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Nombre: " + name + ", Teléfono: " + phone;
        }
    }
}
