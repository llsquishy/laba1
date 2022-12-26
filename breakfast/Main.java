
package breakfast;
public class Main
{
    public static void main(String[] args) throws Exception{

        Food[] breakfast=new Food[20];
        int cheese=0, apple=0, tea=0;
        int itemsSoFar=0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")){
                breakfast[itemsSoFar]=new Cheese();
                cheese++;
            }
            else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar]=new Apple(parts[1]);
                apple++;
            }
            else
            if (parts[0].equals("Tea"))
            {
                breakfast[itemsSoFar]=new Tea(parts[1]);
                tea++;
            }
            for (Food item: breakfast)
                if (item!=null)
                    item.consume();
                else/
                    break;
            System.out.println("кол-во сыров: "+cheese);
            System.out.println("кол-во яблок: "+apple);
            System.out.println("кол-во чая: "+tea);
            System.out.println("Всего хорошего!");

        }
    }
}