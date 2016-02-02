    public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public String toString()
   {
       return "Card[name=" + name + "]";
   }
   
   public boolean isEquals(Card card)
   {
       if (this.getName().equals(card.getName())){
           return true;
       }
       else
       {
           return false;
       }
   }
}