package Clase1Ejs;

import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Object;

public class RadixSort {
    public static void radixSort(int []arr){
        String arrStr[] = StringUtil.toStringArray(arr);
        StringUtil.lNormalize(arrStr, '0');

        HashMap<Integer,ArrayList<String>> hm = new HashMap<>();

        int cantDig = arrStr[0].length();
        for(int i=0; i<cantDig; i++)
        {
            // agrega 10 entradas, de 0 a 9, con arraylists vacios
            inicializarHM(hm);

            int digPos = cantDig-1-i;
            for(int j=0; j<arrStr.length; j++)
            {
                int d = arrStr[j].charAt(digPos)-'0';
                hm.get(d).add(arrStr[j]);
            }

            rearmarArray(arrStr,hm);
        }

        int arrInt[] = StringUtil.toIntArray(arrStr);
        for (int x=0;x<arrInt.length; x++){
            arr[x]=arrInt[x];
        }
    }

    private static void inicializarHM(HashMap<Integer,ArrayList<String>> hm)
    {
        hm.clear();
        for(int i=0; i<10; i++)
        {
            hm.put(i,new ArrayList<>());
        }
    }
    private static void rearmarArray(String[] arrStr, HashMap<Integer,ArrayList<String>> hm)
    {
        int k=0;
        for(int i=0; i<10; i++)
        {
            ArrayList<String> x = hm.get(i);
            for(int j=0; j<x.size(); j++)
            {
                arrStr[k++]=x.get(j);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
