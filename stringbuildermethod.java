public class stringbuildermethod {
    public static void main(String[] args) {

       
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Original String : " + sb);

       
        sb.append(" Programming");
        System.out.println("append() : " + sb);

        
        sb.insert(5, "Language ");
        System.out.println("insert() : " + sb);

        
        sb.replace(5, 13, "Core ");
        System.out.println("replace() : " + sb);

        
        sb.delete(5, 10);
        System.out.println("delete() : " + sb);

        
        sb.deleteCharAt(4);
        System.out.println("deleteCharAt() : " + sb);

       
        StringBuilder rev = new StringBuilder("Java");
        rev.reverse();
        System.out.println("reverse() : " + rev);

        
        System.out.println("length() : " + sb.length());

       
        System.out.println("capacity() : " + sb.capacity());

       
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity() : " + sb.capacity());

        
        System.out.println("charAt(2) : " + sb.charAt(2));

        
        sb.setCharAt(0, 'K');
        System.out.println("setCharAt() : " + sb);

       
        System.out.println("substring(0,4) : " + sb.substring(0, 4));

      
        sb.trimToSize();
        System.out.println("trimToSize() Capacity : " + sb.capacity());

        
        StringBuilder s1 = new StringBuilder("Apple");
        StringBuilder s2 = new StringBuilder("Banana");
        System.out.println("compareTo() : " + s1.compareTo(s2));
    }
}