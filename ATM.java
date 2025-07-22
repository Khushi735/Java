import java.text.*;
import java.util.*;

//controller part
public class ATM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);//for input support

        ArrayList<Account> table=new ArrayList<>();//storing Account objects
        DateFormat df=new SimpleDateFormat("dd/MM/yy HH:mm:ss"); //Date-time format
        Date dateobj =new Date();//System Date-time
        try
        {
            //use this dummy data for tes1ting
            table.add(new Account(12347887,"Usha", 1234, 500000));
            table.add(new Account( 23429876,  "Nethra",  1111,  506700));
            table.add(new Account( 12780009,  "Nisha",  2231,  370000));
            table.add(new Account( 87667655,  "Anusha", 4645,  750800));
            table.add(new Account( 78644323,  "Amith", 3333,  736700));
            table.add(new Account( 76450987, "Nisarga", 5467,  249700));
            table.add(new Account( 44447655,  "Shravani",  4567,  367000));
            table.add(new Account( 55550876,  "Ammu",  1124,  30000));
            table.add(new Account( 12565434,  "Ram",  1677, 29000));
            table.add(new Account( 12621781, "Yashu", 9252, 1000000));

            System.out.println("\n*************************************");
            System.out.println("Welcome to state bank of India\n");
            while(true)
            {
                System.out.println("________________________");
                System.out.println("For new Account>>Press 1  -open new account");
                System.out.println("Exixting Account>>Press 2 -go to Login page\n ");
                System.out.println("___________________________");

                int acc,c,found=0,pin,op;
                double amt;
                Account active=null;//stores the active Account object
                c=sc.nextInt();
                switch(c)
                {
                    case 1:System.out.println("      >> SIGN UP <<");
                           System.out.println("Note: Don't use space in Name)");
                           System.out.print("Enter First name: ");
                           String new_name_f=sc.next();
                           System.out.print("Enter Last name: ");
                           String new_name_l=sc.next();

                           int random_acc=(int)(Math.random()*(99999999-10000000+1)+10000000);
                           int random_pin=(int)(Math.random()*(9999-1000+1)+1000);

                           table.add(new Account(random_acc, (new_name_f+" "+new_name_l),random_pin, 0));

                           System.out.println("\n>>New account created Successfully<<");
                           System.out.println("New Acc. no.="+random_acc);
                           System.out.println("New Ac pin="+random_pin);
                           System.out.println("Login to access your new account & change your pin");
                           break;

                    case 2:System.out.println("    >>LOGIN<<");
                           System.out.println("Enter Account Number:");
                           acc=sc.nextInt();
                           //Iterate through the database to find the Account
                           Iterator it=table.iterator();
                           while(it.hasNext())
                           {
                               Account ur=(Account)it.next();
                               if(ur.getAccount_id()==acc)
                               {
                                   found=1;
                                   System.out.print("Enter pin:");
                                   pin=sc.nextInt();
                                   if(ur.getPin()==pin)
                                   {
                                       active=ur;//active Account
                                       System.out.println("\n<Successfully Logged in at"+df.format(dateobj)+">\n");
                                       System.out.println("\n **Welcome "+active.getName()+"**");
                                       found=2;
                                       break;
                                   }
                               }
                           }
                           if(found==0)
                           {
                               System.out.println("\n!!Invalid account number!!");
                               System.out.println("!!Please try again later!!");
                               System.out.println("\n<Session ended at "+df.format(dateobj)+">\n");
                               System.exit(0);
                           }
                           if(found==1)
                           {
                               System.out.println("\n!!Invalid Pin!!");
                               System.out.println("!!Please try again later!!");
                               System.out.println("\n<Session ended at "+df.format(dateobj)+">\n");
                               System.exit(0);
                           }
                           while(true)
                           {
                               System.out.println("\n___________________");
                               System.out.println("Select Operation:");
                               System.out.println("1-Update pin");
                               System.out.println("2-Balance Enquiry");
                               System.out.println("3-Withdraw Money");
                               System.out.println("4-Deposit Money");
                               System.out.println("5-Logout");
                               System.out.println("\n_____________________");
                               int ch=sc.nextInt();
                               switch (ch)
                               {
                                   case 1:System.out.print("Enter old pin:");
                                          op=sc.nextInt();
                                          if(op==active.getPin())
                                          {
                                              System.out.print("Enter new Pin:");
                                              active.setPin(sc.nextInt());
                                              System.out.println(">> PIN UPDATED SUCCESSFULLY <<");
                                          }
                                          else {
                                              System.out.println("\n   !!INVALID PIN!! ");
                                          }
                                          break;
                                   case 2:System.out.println("AVAILABLE BALANCE = Rs."+active.getBalance());
                                          break;

                                   case 3:System.out.print("\nEnter Amount to be Withdrawn: Rs.");
                                          amt=sc.nextDouble();
                                          if(amt>active.getBalance())
                                              System.out.println("\n !!INSUFFICIENT BALANCE!!");
                                          else
                                          {
                                              active.setBalance(active.getBalance()-amt);
                                              System.out.println(">>WITHDRAWL SUCCESSFULL<<");
                                             System.out.println("AVAILABLE BALANCE = Rs."+active.getBalance());
                                         }
                                          break;

                                   case 4:
                                	    System.out.println("\n Enter amount to be deposited: Rs.");
                                	    amt = sc.nextDouble();

                                	    if (amt <= 0) {
                                	        System.out.println("\n!! INVALID AMOUNT !!");
                                	        System.out.println("Amount must be greater than 0.");
                                	    } else if (amt > 1000000) {
                                	        System.out.println("\nYour amount exceeds limit.");
                                	        System.out.println("Maximum depositing amount at once = Rs. 1000000");
                                	    } else {
                                	        active.setBalance(active.getBalance() + amt);
                                	        System.out.println(">> DEPOSIT SUCCESSFUL <<");
                                	        System.out.println("AVAILABLE BALANCE = Rs." + active.getBalance());
                                	    }
                                	    break;


                                   case 5:System.out.println("\nThanks for using SBI, visit again :)");
                                          System.out.println("\n<Session ended at "+df.format(dateobj)+">\n");
                                          System.exit(0);
                                   default:System.out.println("\n!!WRONG CHOICE!!\nPress between 1 t0 5");
                               }//end of inner switch
                           }//end of inner while
                    default:System.out.println("\n!!WRONG CHOICE!!\nPress between 1to 2");
                }//end of outer switch
            }//end of outer while

        }//try block
        catch(Exception e)
        {
           System.out.println("\nWARNING!!\nPlease use correct input format");
           System.out.println("\n<Session expired at "+df.format(dateobj)+">\n");
        }//end of catch block

    }//end of main
}//end of class