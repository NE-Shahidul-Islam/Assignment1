import java.io.*;

public class copyFileThroughArgument {

    public static void main(String[] args) throws Exception{
        String mainFile;
        String copyFile;

        if (args.length != 2) {
            mainFile = "main.txt";
            copyFile = "copy.txt";
        } else {
            mainFile = args[0];
            copyFile = args[1];
        }

     File source = new File(mainFile);
        File des = new File(copyFile);

        try( BufferedReader reader = new BufferedReader(new FileReader(source));

             BufferedWriter writer = new BufferedWriter(new FileWriter(des));){


            String line;
            while((line = reader.readLine()) != null){

                writer.write(line + '\n');
                //System.out.println(line);
            }

        } catch (FileNotFoundException e){
            System.out.println("Bhaii tomar file paoa jacche na" + e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (SecurityException e){
            System.out.println(e.getMessage());
        }
    }
}
