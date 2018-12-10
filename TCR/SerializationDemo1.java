import java.io.*;

class Demo implements Serializable {
    public int a;
    public String s;

    public Demo(int a, String s) {
        this.a = a;
        this.s = s;
    }
}

class SerializationDemo1 {
    public static void main(String[] args) {
        Demo obj = new Demo(1, "Siddhant");

        try {
            FileOutputStream file = new FileOutputStream("file");
            ObjectOutputStream objOStream = new ObjectOutputStream(file);

            objOStream.writeObject(obj);

            objOStream.close();
            file.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }

        Demo obj1 = null;

        try {
            FileInputStream file = new FileInputStream("file");
            ObjectInputStream objIStream = new ObjectInputStream(file);

            obj1 = (Demo)objIStream.readObject();

            System.out.println(obj1);
            
            objIStream.close();
            file.close();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}