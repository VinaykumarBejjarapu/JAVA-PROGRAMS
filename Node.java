public class Node 
{
      int data;
     Node next;
     Node(int x)
     {
          data=x;
          next=null;
     }
}

class Test
{  
     public  static  Node insertAtstart(int data, Node head)
     {
          
          
             Node temp=new Node(data);
               temp.next=head;
          
         return temp;
     }

     public static Node insertAtend(int data,Node head)
     {
              if(head==null)
               {
                   Node t =new Node(data);
                   return t;
               }
          Node temp=head;
          while(temp.next!=null)
          {
               temp=temp.next;
               
          }
          temp.next = new Node(data);
          return head;
     }
     public static Node insertAtindex(int index ,int data,Node head)
     {
          if(head==null)
          {
               Node n=new Node(data);
                head=n;
          }
          
          Node curr = head;
          for(int i=1)
          return head;
     }
     public static void main(String args[])
     {
           int arr[]={9,18,27,36,45};
                Node head=new Node(arr[0]);
                Node curr=head;
                for(int i=1;i<arr.length;i++)
                {
                     curr.next=new Node(arr[i]);
                     curr=curr.next;
                }
           
           Node start= insertAtstart(54,head);
           Node headd= insertAtend(63,start);
             Node temp=headd;
            while(temp!= null)
            {
               System.out.print(temp.data + " " );
               temp=temp.next;
            }

     }
}
