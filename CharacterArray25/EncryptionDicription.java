// package CharacterArray25;

// public class EncryptionDicription 
// {

//     static char[] encryptionmsg(char[] arr)
//     {
//         if(arr == null || arr.length == 0)
//         {
//             System.out.println("array is empty");
//             return null;
//         }

        
//         for(int i = 0; i < arr.length; i++)
//         {
//             arr[i] = (char) (arr[i] + arr.length - i);
             
//         }
//         return arr;

//     }
    
//     static char[] discription(char[] arr)
//     {
//         for(int i = 0; i < arr.length; i++)
//         {
//             arr[i] = (char) (arr[i]- arr.length + i);
            
//         }
//         return arr;
//     }

   
//     public static void main(String[] args) 
//     {
//         String msg = " Note Ban";
//         char[] arr = msg.toCharArray();

//         char[] result = new char[arr.length];
//         result = encryptionmsg(arr);
//         for(int i = 0; i < result.length;i++)
//         {
//             System.out.print(result[i]);
//         }

//         System.out.println();
//         char[] discription = discription(result);
//         for(int i = 0; i < discription.length; i++)
//         {
//             System.out.print(discription[i]);
//         }
    
//     }
// }






package CharacterArray25;

public class EncryptionDicription {

    static char[] encryptionmsg(char[] arr) {
        char[] alphabet = {
            'Q','W','E','R','T','Y','U','I','O','P',
            'A','S','D','F','G','H','J','K','L','Z',
            'X','C','V','B','N','M'
        };

        for (int i = 0; i < arr.length; i++) {
            int index = Character.toLowerCase(arr[i]) - 'a';
            arr[i] = alphabet[index];
        }

        return arr;
    }

    static char[] discription(char[] arr) {
        char[] alphabet = {
            'Q','W','E','R','T','Y','U','I','O','P',
            'A','S','D','F','G','H','J','K','L','Z',
            'X','C','V','B','N','M'
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (arr[i] == alphabet[j]) {
                    arr[i] = (char) ('a' + j);
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        String msg = "hit";

        char[] arr = msg.toCharArray();

        char[] encrypted = encryptionmsg(arr);

        System.out.println("Encrypted: " + new String(encrypted));

        char[] decrypted = discription(encrypted);

        System.out.println("Decrypted: " + new String(decrypted));
    }
}

