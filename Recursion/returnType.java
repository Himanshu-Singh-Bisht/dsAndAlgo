import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class returnType
{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        basicFunctions();
    }

    public static void basicFunctions()
    {   
        // Print elements 1 - 10 or 10 - 1  _____________________________________________
        // System.out.print(printInc(1 , 10));
        // System.out.print(printDec(10 , 1));



        // FACTORIAL    ______________________________________
        // System.out.println(factorial(5));



        // POWER   ______________________________________
        // System.out.println(power(2 , 6));
        // System.out.println(powerModified(2 , 6));

        

        // RECURSION WITH ARRAY ____________________________________________________________
        // int[] arr = { 1, 5, 4, 5, 5, 2, 4, 8, 5, 5, 9, 6, 3, 5, 4, 7, 8, 5, 2, 5, 2,
                    // 3, -5, 9, 7, 1, 2, 5 };
        // displayArray(arr , 0); 
        // System.out.println(find(arr , 0 , 8));
        // System.out.println(maximum(arr , 0));
        // System.out.println(minimum(arr, 0));
        // System.out.println(lastIndex(arr , 0 , 2));
        // displayArray( allIndex(arr, 0, 2, 0) , 0);



        // TOTAL JUMPS POSSIBLE TO REACH N VIA 1, 2 , 3 JUMPS POSSIBLE  __________________________________
        // System.out.println(totalJumps(3));



        // STRING TYPE  _____________________________________________________________________
        // ArrayList<String> subseq = subsequences("abcd");
        // ArrayList<String> subseq = subsequences1("abcd");
        // displayArrayList(subseq);
        // System.out.println(removeHi("iihihiiih"));
        // System.out.println(removeHiNotHit("iitihithiithii"));
        // System.out.println(removeDuplicate("aabbccddeffea"));
        // System.out.println(compression("abbccddeefff" , 0 , 1));
        // System.out.println(compression_2("aaabbcccdeef" , 1));
        // ArrayList<String> permu = permutation("abc");
        // displayArrayList(permu);



        // MAZEPATH TYPE    ________________________________________________________________
        // ArrayList<String> ans = mazepathHV(0 , 0 , 2 , 2);
        // displayArrayList(ans);
        // ArrayList<String> ans = mazepathHVD(0 , 0 , 2 , 2);
        // displayArrayList(ans);
        // System.out.println(mazepathHeight(0 , 0 , 2, 2));
        // ArrayList<String> ans = mazepathMultimoveHVD(0 , 0 , 2 , 2);
        // displayArrayList(ans);



        // FLOODFILL TYPE   ________________________________________________________________________________
        // boolean[][] isdone = {{false , false , false , false},
        //                     {false , false , false , false},
        //                     {false , false , false , false},
        //                     {false , false , false , false}};
        // ArrayList<String> ans = floodfill4Moves(0 , 0 , isdone.length - 1 , isdone[0].length - 1 , isdone);
        // displayArrayList(ans); 


        // int[][] dir = {{-1 , 0} , {0 , 1} , {1 , 0} , {0 , -1}};
        // String[] d = {"U" , "R" , "D" , "L"};
        // ArrayList<String> ans = floodfill4MovesLoop(0 , 0 , isdone.length - 1 , isdone[0].length - 1 , isdone 
        // , dir , d);
        // displayArrayList(ans);

        // int[][] dir = {{-1 , 0} , {-1 , 1} , {0 ,1} , {1 , 1} , 
        //                 {1 , 0} , {1 , -1} , {0 , -1} , {-1 , -1}};
        // String[] d = {"U" , "d1" , "R" , "d2" , "D" , "d3" , "L" , "d4"};
        // ArrayList<String> ans = floodfill8MovesLoop(0 , 0, isdone.length - 1 , isdone[0].length - 1 
        //                                     , isdone , dir , d);
        // displayArrayList(ans);
    
        // boolean[][] blockedIsdone = {{false , false , true},
        //                             {false , true , false},
        //                             {false , false , true},
        //                             {true , false , false}};
        // ArrayList<String> ans = floodfill8MovesLoop(0, 0, blockedIsdone.length - 1,
        //                                  blockedIsdone[0].length- 1, blockedIsdone, dir, d);
        // displayArrayList(ans);

        // int[][] dirKnight = {{1 ,2} , {2 , 1} , {2 , -1} , {1 , -2} , {-1 , -2} , {-2 , -1} , {-2 , 1}};
        // // System.out.println(knightFloodfill(0, 0, isdone.length - 1, isdone[0].length - 1, isdone , dirKnight));
        
        // int[][] ans = new int[8][8];
        // System.out.println(knightFill(0 , 0 , (ans.length) * (ans[0].length) 
        //                                     , 1 , ans , dirKnight));


        // NOKIA KEYPAD___________________________________________________________________
        // String[] keys ={"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqr" , "st" , "uvw" , "xyz"};
        // ArrayList<String> ans = keypad("405" , keys);
        // displayArrayList(ans);


        // ENCODING____________________________________________________________________
        // ArrayList<String> ans = encoding("1003");
        // displayArrayList(ans);


        // SUDOKU __________________________________________________________________
        int[][] board = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        System.out.println(sudoku(board , 0));
    }


    // PRINTING THE ELEMENTS INCREASING AND DECREASING (RETURN TYPE)______________________________________
    public static int printInc(int start , int end)
    {
        if(start == end)
        {
            return end;
        }
        System.out.print(printInc(start, end - 1) + " ");
        return end;
    }

    public static int printDec(int start , int end)
    {
        if(start == end)
        {
            return end;
        }
        System.out.print(printDec(start , end + 1) + " ");
        return end;
    }


    //  FACTORIAL _______________________________________________
    public static int factorial(int n)
    {
        if(n == 1)
        {
            return n;
        }

        return (n * factorial(n - 1));
    } 



    // POWER ________________________________________________
    public static int power(int a , int b)
    {
        if(b == 1)
        {
            return a;
        }
        return (a * power(a, b - 1));
    }

    public static int powerModified(int a , int b)
    {
        if(b == 1)
        {
            return a;
        }
        
        if(b % 2 == 0)
        {
            return powerModified(a, b / 2) * powerModified(a, b / 2);
        }
        else
        {
            return powerModified(a , b / 2) * powerModified(a, b / 2) * a;
        }
    }



    // RECURSION WITH ARRAY
    public static void displayArray(int[] arr , int vidx)
    {
        if(vidx == arr.length)
        {
            return;
        }
        System.out.print(arr[vidx] + " ");
        displayArray(arr, vidx + 1);
    }

    public static boolean find(int[] arr , int vidx , int data)
    {
        if(vidx == arr.length)
        {
            return false;
        }

        if(arr[vidx] == data)
        {
            return true;
        }
        return find(arr , vidx + 1, data);
    }

    public static int maximum(int[] arr , int vidx)
    {
        if(vidx == arr.length - 1)
        {
            return arr[vidx];
        }

        int p = Math.max(arr[vidx] , maximum(arr , vidx + 1));
        return p;
    }

    public static int minimum(int[] arr , int vidx)
    {
        if(vidx == arr.length - 1)
        {
            return arr[vidx];
        }

        int p = Math.min(arr[vidx] , minimum(arr , vidx + 1));
        return p;
    }

    public static int lastIndex(int[] arr , int vidx , int data)
    {
        if(vidx == arr.length)
        {
            return -1;
        }

        int p = lastIndex(arr, vidx + 1, data);
        if(p != -1)
        {
            return p;
        }
        else 
        {
            return (arr[vidx] == data ? vidx : -1);
        }
    }

    public static int[] allIndex(int[] arr , int vidx , int data , int size)
    {
        if(vidx == arr.length)
        {
            int[] baseArray = new int[size];
            return baseArray;
        }

        if(arr[vidx] == data)
        {
            size++;
        }

        int[] recAns = allIndex(arr, vidx + 1, data, size);
        if(arr[vidx] == data)
        {
            recAns[size - 1] = vidx;
        }

        return recAns;
    }



    // TOTAL JUMPS POSSIBLE TO REACH N VIA 1, 2 , 3 JUMPS POSSIBLE __________________________________
    public static int totalJumps(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int count = 0;
        if(n - 1 >= 0)  count += totalJumps(n - 1);
        if(n - 2 >= 0)  count += totalJumps(n - 2);
        if(n - 3 >= 0)  count += totalJumps(n - 3);

        return count;
    }




    // STRING TYPE _______________________________________________________________

    public static ArrayList<String> subsequences(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> recAns = subsequences(str.substring(1));
        ArrayList<String> myAns = new ArrayList<>();

        myAns.addAll(recAns);       // to add all elements of the recAns ArrayList
        for(String s : recAns)
        {
            myAns.add(ch + s);
        }

        return myAns;
    }

    public static ArrayList<String> subsequences1(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> ans = subsequences1(str.substring(1));
        int size = ans.size();

        for(int i = 0 ; i < size ; i++)
        {
            ans.add(ch + ans.get(i));
        }

        return ans;
    }

    public static void displayArrayList(ArrayList<String> list)
    {
        for(String s : list)
        {
            System.out.println(s);
        }
    }

    public static String removeHi(String str)
    {
        if(str.length() == 0)
        {
            return "";
        }

        if(str.length() > 1 && str.substring(0 , 2).equals("hi"))
        {
            return removeHi(str.substring(2));
        }
        else
        {
            char ch = str.charAt(0);
            return ch + removeHi(str.substring(1));
        }
    }

    public static String removeHiNotHit(String str)
    {
        if(str.length() == 0)
        {
            return "";
        }

        if(str.length() > 1 && str.substring(0 , 2).equals("hi"))
        {
            if(str.length() > 2 && str.charAt(2) == 't')
            {
                return "hit" + removeHiNotHit(str.substring(3));
            }
            else
            {
                return removeHiNotHit(str.substring(2));
            }
        }
        else
        {
            return str.charAt(0) + removeHiNotHit(str.substring(1));
        }
    }

    public static String removeDuplicate(String str)
    {
        if(str.length() == 1)
        {
            return str;
        }

        char ch = str.charAt(0);
        
        String ans = removeDuplicate(str.substring(1));
        if(ans.charAt(0) == ch)
        {
            return ans;
        }
        return ch + ans;
    }

    public static String compression(String str , int vidx , int count)
    {
        if(vidx == str.length() - 1)
        {
            return str.charAt(vidx) + (count > 1 ? count + "" : "");
        }

        if(str.charAt(vidx) == str.charAt(vidx + 1))
        {
            return compression(str , vidx + 1 , count + 1);
        }
        else
        {
            return str.charAt(vidx) + (count > 1 ? count + "" : "") + compression(str, vidx + 1, 1);
        }
    }

    public static String compression_2(String str , int count)
    {
        if(str.length() == 1)
        {
            return str.charAt(0) + (count > 1 ? count + "" : "");
        }

        if(str.charAt(0) == str.charAt(1))
        {
            return compression_2(str.substring(1) , count + 1);
        }
        else
        {
            return str.charAt(0) + (count > 1 ? count + "" : "") +  compression_2(str.substring(1) , 1);
        }
    }

    public static ArrayList<String> permutation(String str)
    {
        if(str.length() == 1)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add(str);
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> recAns = permutation(str.substring(1));

        for(String s : recAns)
        {
            for(int i = 0; i <= s.length() ; i++)  // = (equal) is used as the substring 2nd arg is exclusive
            {
                ans.add(s.substring(0 , i) + str.charAt(0) + s.substring(i , s.length()));
            }
        }
        return ans;
    }


    // MAZEPATH TYPE __________________________________________________
    public static ArrayList<String> mazepathHV(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(sr + 1 <= er)
        {
            ArrayList<String> recAns = mazepathHV(sr + 1 , sc , er , ec);    
            for(String s : recAns)
            {
                ans.add("H" + s);
            }            
        }

        if(sc + 1 <= ec)
        {
            ArrayList<String> recAns = mazepathHV(sr, sc + 1, er, ec);
            for(String s : recAns)
            {
                ans.add("V" + s);
            }
        }
        return ans;
    }

    public static ArrayList<String> mazepathHVD(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(sc + 1 <= ec)
        {
            ArrayList<String> recAns = mazepathHVD(sr, sc + 1, er, ec);
            for(String s : recAns)
            {
                ans.add("H" + s);
            }
        }
        if(sr + 1 <= er)
        {
            ArrayList<String> recAns = mazepathHVD(sr + 1, sc, er, ec);
            for(String s : recAns)
            {
                ans.add("V" + s);
            }
        }
        if(sr + 1 <= er && sc + 1 <= ec)
        {
            ArrayList<String> recAns = mazepathHVD(sr + 1, sc + 1, er, ec);
            for(String s : recAns)
            {
                ans.add("D" + s);
            }
        }
        return ans;
    }

    public static int mazepathHeight(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            return -1;
        }

        int max_h = 0;
        if(sr + 1 <= er)
        {
            max_h = Math.max(max_h , mazepathHeight(sr + 1, sc, er, ec));
        }
        if(sc + 1 <= ec)
        {
            max_h = Math.max(max_h , mazepathHeight(sr, sc + 1, er, ec));
        }

        return max_h + 1;
    }

    public static ArrayList<String> mazepathMultimoveHVD(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; sr + i <= er ; i++)
        {
            ArrayList<String> recAns = mazepathMultimoveHVD(sr + i, sc, er, ec);
            for(String s : recAns)
            {
                ans.add("H" + i + s);
            }
        }

        for(int i = 1 ; sc + i <= ec ; i++)
        {
            ArrayList<String> recAns = mazepathMultimoveHVD(sr, sc + i, er, ec);
            for(String s : recAns)
            {
                ans.add("V" + i + s);
            }
        }
        return ans;
    }


    // FLOODFILL TYPE _________________________________________________________
    public static ArrayList<String> floodfill4Moves(int sr , int sc , int er , int ec , boolean[][] isdone)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        isdone[sr][sc] = true;
        ArrayList<String> ans = new ArrayList<>();

        if(sr - 1 >= 0 && !isdone[sr - 1][sc])
        {
            ArrayList<String> up = floodfill4Moves(sr - 1, sc, er, ec, isdone);
            for(String s : up)
            {
                ans.add("U" + s);
            }
        }

        if(sc + 1 <= ec && !isdone[sr][sc  + 1])
        {
            ArrayList<String> right = floodfill4Moves(sr, sc + 1, er, ec, isdone);
            for(String s : right)
            {
                ans.add("R" + s);
            }
        }

        if(sr + 1 <= er && !isdone[sr + 1][sc])
        {
            ArrayList<String> down = floodfill4Moves(sr + 1, sc, er, ec, isdone);
            for(String s : down)
            {
                ans.add("D" + s);
            }
        }

        if(sc - 1 >= 0 && !isdone[sr][sc - 1])
        {
            ArrayList<String> left = floodfill4Moves(sr, sc - 1, er, ec, isdone);
            for(String s : left)
            {
                ans.add("L" + s);
            }
        }

        isdone[sr][sc] = false;
        return ans;
    }


    public static ArrayList<String> floodfill4MovesLoop(int sr , int sc, int er , int ec ,
                                                     boolean[][] isdone , int[][] dir , String[] d)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        isdone[sr][sc] = true;
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0 ; i < d.length ; i++)
        {
            int x = sc + dir[i][1];
            int y = sr + dir[i][0];

            if(isvalid(y , x , isdone))
            {
                ArrayList<String> recans = floodfill4MovesLoop(y , x , er, ec, isdone , dir , d);
                for(String s : recans)
                {
                    ans.add(d[i] + s);
                }
            }
        }

        isdone[sr][sc] = false;
        return ans;
    }

    public static boolean isvalid(int x , int y , boolean[][] isdone)
    {
        if(x >= 0 && y >= 0 && x < isdone.length && y < isdone[0].length && !isdone[x][y])
        {
            return true;
        }
        return false;
    }


    public static ArrayList<String> floodfill8MovesLoop(int sr , int sc , int er , int ec ,
                                         boolean[][] isdone , int[][] dir , String[] d)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        isdone[sr][sc] = true;

        for(int i = 0 ; i < d.length ; i++)
        {
            int x = sc + dir[i][1];
            int y = sr + dir[i][0];

            if(isvalid(y , x , isdone))
            {
                ArrayList<String> recAns = floodfill8MovesLoop(y, x, er, ec, isdone, dir, d);
                for(String s : recAns)
                {
                    ans.add(d[i] + s);
                }
            }
        }
        isdone[sr][sc] = false;
        return ans;
    }


    public static int knightFloodfill(int sr , int sc , int er , int ec , boolean[][] isdone , int[][] dirKnight)
    {
        if(sr == er && sc == ec)
        {
            return 1;
        }

        int count = 0;
        isdone[sr][sc] = true;
        for(int i = 0 ; i < dirKnight.length ; i++)
        {
            int x = sc + dirKnight[i][1];
            int y = sr + dirKnight[i][0];

            if(isvalid(y , x , isdone))
            {
                count += knightFloodfill(y, x, er, ec, isdone , dirKnight);
            }
        }

        isdone[sr][sc] = false;
        return count;
    }


    public static boolean knightFill(int sr , int sc , int boxSize , int count , int[][] ans , int[][] dirKnight)
    {
        ans[sr][sc] = count;
        if(count == boxSize)
        {
            for(int[] ar : ans)
            {
                for(int ele : ar)
                {
                    System.out.print(ele + "\t");
                }
                System.out.println();
            }
            return true;
        }

        boolean res = false;
        for(int i = 0 ; i < dirKnight.length ; i++)
        {
            int x = sc + dirKnight[i][1];
            int y = sr + dirKnight[i][0];
            
            if(x >= 0 && y >= 0 && y < ans.length && x < ans[0].length && ans[y][x] == 0)
            {
                res = res || knightFill(y, x, boxSize, count + 1, ans, dirKnight);
            }
        }

        ans[sr][sc] = 0;
        return res;
    }


    // NOKIA KEYPAD_________________________________________________________________
    public static ArrayList<String> keypad(String num , String[] keys)
    {
        if(num.length() == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        
        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> recAns = keypad(num.substring(1), keys);
        char ch = num.charAt(0);
        int btn = ch - '0';

        for(int i = 0 ; i < keys[btn].length() ; i++)
        {
            for(String s : recAns)
            {
                ans.add(keys[btn].charAt(i) + s);
            }
        }
        return ans;
    }


    // ENCODING _____________________________________________________________
    public static ArrayList<String> encoding(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        if(ch == '0')
        {
            return encoding(str.substring(1));
        }
        else
        {
            ArrayList<String> rec = encoding(str.substring(1));
            char c = (char)(ch - '1' + 'a');
            for(String s : rec)
            {
                ans.add(c + s);
            }
        }

        if(str.length() > 1)
        {
            char ch2 = str.charAt(1);
            int n = (ch - '0') * 10 + (ch2 - '0');

            if(n <= 27)
            {
                char c = (char)(n - 1 + 'a');
                ArrayList<String> rec = encoding(str.substring(2));
                for(String s : rec)
                {
                    ans.add(c + s);
                }
            }
        }

        return ans;
    }


    // SUDOKU _________________________________________________________
    public static int sudoku(int[][] board , int vidx)
    {
        if(vidx == board.length * board[0].length)
        {
            for(int[] ar : board)
            {
                for(int ele : ar)
                {
                    System.out.print(ele + "\t");
                }
                System.out.println();
            }
            System.out.println("\n\n");
            
            return 1;
        }

        int count = 0;

        int r = vidx / 9;
        int c = vidx % 9;

        if(board[r][c] != 0)        // preoccupied cell
        {
            count += sudoku(board, vidx + 1);
        }
        else
        {
            for(int n = 1 ; n <= 9 ; n++)
            {
                if(isValidSudoku(board , r , c , n))
                {
                    board[r][c] = n;
                    count += sudoku(board , vidx + 1);
                    board[r][c] = 0;
                }
            }
        }

        return count;
    }

    public static boolean isValidSudoku(int[][] board , int r , int c , int num)
    {
        // check in row
        for(int i = 0 ; i < board[0].length ; i++)
        {
            if(board[r][i] == num)
            {
                return false;
            }
        }

        // check in column
        for(int j = 0 ; j < board.length ; j++)
        {
            if(board[j][c] == num)
            {
                return false;
            }
        }

        // check for 3 X 3 matrix
        int x = (r / 3) * 3;
        int y = (c / 3) * 3;
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                if(board[i + x][j + y] == num)
                {
                    return false;
                }
            }
        }

        return true;
    } 
}