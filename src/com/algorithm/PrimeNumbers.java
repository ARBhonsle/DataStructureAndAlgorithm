package com.algorithm;

import java.util.ArrayList;

/**
 * Prime Numbers class finds prime numbers up to given number
 * checks if primes are palindrome and anagram
 */
public class PrimeNumbers {
    static ArrayList<Integer> primes = new ArrayList<>();
    public boolean isPrime(int number){
        int count = 0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }

    public void findPrimeNumbers(int number){
        for(int i=2;i<=number;i++){
            if(isPrime(i)){
                System.out.println(i);
                primes.add(i);
            }
        }
    }
    public void primeIsAnagramAndPalindrome(){
        AnagramChecker checker =new AnagramChecker();
        for(int j=0;j<primes.size();j++){
            Integer reverseNumber = 0;
            for(int k=primes.get(j);k>0;){
                reverseNumber = reverseNumber*10 +k%10;
                k/=10;
            }
            if(primes.get(j).compareTo(reverseNumber)>0){
                System.out.println(primes.get(j)+" is Palindrome");
            }
            for(int i=j;i<primes.size();i++){
                if(checker.isAnagram(primes.get(j).toString().toCharArray(),primes.get(i).toString().toCharArray())){
                    System.out.println(primes.get(i)+" and "+primes.get(j)+" are anagrams");
                }
            }
        }

    }
}
