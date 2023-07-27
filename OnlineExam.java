package Oasis;

import java.util.Scanner;
import java.util.HashMap;

class OnlineExam{
    HashMap<String,Integer> hash = new HashMap <String,Integer>();
    Scanner input = new Scanner(System.in);
    
    public void login()
    {
    	hash.put("Affan",1000);
    	hash.put("Zaid",1001);
    	hash.put("Zain",1002);
    	
    	System.out.println("\n********** Welcome to ONLINE EXAM SYSTEM **********\n");
        System.out.println("Enter User-Id: ");
        String userID = input.nextLine();
        System.out.println("Enter Password: ");
        int password = input.nextInt();
        
        
        if (hash.containsKey(userID) && hash.get(userID) == password)
        {
            System.out.println("Log-In Successful!");
            main();
        }
        else{
            System.out.println("Invalid!! Please Check...");
            login();
        }
    }
    
    public void main()
    {
        System.out.println("\n1.Update\n2.Start test\n3.Logout");
        System.out.println("Enter your choice: ");
        int op=input.nextInt();
        switch(op){
            case 1 : 
            	hash = update();
            	main();
            	break;
            case 2 : 
            	solve();
            	main();
            	break;
            case 3 : 
            	System.exit(0);
            	break;
            default: 
            	System.out.println("Invalid Choice!");
        }
    }
    
    public HashMap<String,Integer> update()
    {
        System.out.println("\n----- Update -----");
        System.out.println("Enter Username: ");
        
        String update_id = input.next();
        System.out.println("Enter Old Password:");
		int update_pwd = input.nextInt();
		if(hash.containsKey(update_id) && hash.get(update_id)==update_pwd)
		{
            System.out.println("Enter New Password: ");
            int newpd = input.nextInt();
            hash.replace(update_id,newpd);
            System.out.println("Password Update Success!");
        }
        else
        {
            System.out.println("User does not exist...");
            System.out.println("Profile Update Failed!");
        }
        return hash;
    }
    
    public void solve(){
        long startTime = System.currentTimeMillis();
        long EndTime = startTime + 30;
        int score = 0;
        char ans;
        System.out.println("\n\n******* Starting The Test *******");
        System.out.println("Each question gives +5 marks for a correct answer and -1 mark for a wrong answer.");
       
        while(System.currentTimeMillis() < EndTime)
        {
            System.out.println("\nQ1.When an array is passed to a method, what does the method receive?");
            System.out.println("a.Reference of array\nb.Copy of array\nc.Length of array\nd.Nothing");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'a')
            {
            	score += 5;
            }
            else
            	score --;
            
            System.out.println("\nQ2.Identify the modifier which cannot be used for constructor?");
            System.out.println("a.Public\nb.Protected\nc.Private\nd.Static");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'd'){
            	score += 5;
            }
            else
            	score --;
            
            System.out.println("\nQ3.When is the finalize() method called?");
            System.out.println("a.Before garbage collection.\nb.Before an object goes out of scope.\nc.Before a variable goes out of scope.\nd.None.");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'a')
            {
            	score += 5;
            }
            else
            	score --;
            
            System.out.println("\nQ4.Which of the following interface must contain a unique element?");
            System.out.println("a.Set\nb.Collection\nc.List\nd.Array");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'a')
            {
            	score += 5;
            }
            else
            	score --;
            
            System.out.println("\nQ5.Identify the incorrect Java feature?");
            System.out.println("a.Object Oriented\nb.Use of Pointer\nc.Dynamic\nd.None of the above");
            System.out.println("Answer:");
            ans = input.next().charAt(0);
            if(ans == 'b') 
            {
            	score += 5;
            }
            else
            	score --;
            
            break;
        }
        
        System.out.println("Test Completed!");
        System.out.println("Congratulations!! Your score is " + score + ".");
    }
    
    public static void main(String args[]){
    	OnlineExam e = new OnlineExam();
        e.login();
    }
}