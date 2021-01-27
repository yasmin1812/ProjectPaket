/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paketdanpengiriman;

import javax.management.RuntimeErrorException;
import junit.framework.AssertionFailedError;
import java.lang.IllegalArgumentException;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author User
 */
public class deliveryTest {
    
    public deliveryTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("+before+");
    }
    
    @After
    public void tearDown() {
        System.out.println("+after+");
    }

    /**
     * Test of hitung method, of class delivery.
     */
    @Test
    public void testHitung_3args_1() {
        System.out.println("+hitung+");
        int berat = 2;
        String kategori = "Same Day";
        int total = 8000;
        delivery instance = new delivery("","","","");
        int expResult = 16000;
        int result = instance.hitung(berat, kategori, total);
        System.out.println("Exp Result : "+expResult);
        System.out.println("Result : "+result);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testVoid_HitungTotal() {
        System.out.println("+hitung total+");
        HChekTarifH instance = new HChekTarifH();
        int expResult = 8000;
        int berat = 2;
        int harga = 4000;
        int result = instance.void_hitungtotal(berat, harga);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVoid_HitungTotal1() {
        System.out.println("+hitung total+");
        HChekTarifH instance = new HChekTarifH();
        int expResult = 13000;
        int total = 8000;
        int result = instance.void_hitungtotal1(total);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVoid_kategori() {
        System.out.println("+Chek Kategori+");
        HChekTarifH instance = new HChekTarifH();
        int expResult = 3000;
        String kategori = "Reguler";
        int result = instance.void_kategori(kategori);
        assertEquals(expResult, result);
        
    }
    
    @Test (expected = AssertionError.class)
    public void testHitung_gagal() {
        System.out.println("+hitung+");
        int berat = 3;
        String kategori = "Same Day";
        int total = 7000;
        delivery instance = new delivery("","","","");
        int expResult = 16000;
        int result = instance.hitung(berat, kategori, total);
        System.out.println("Exp Result : "+expResult);
        System.out.println("Result : "+result);
        assertEquals(expResult, result);
       
    }
    
    @Test (expected = AssertionError.class)
    public void testVoid_HitungTotalgagal() {
        System.out.println("+hitung total+");
        HChekTarifH instance = new HChekTarifH();
        int expResult = 7000;
        int berat = 1;
        int harga = 2000;
        int result = instance.void_hitungtotal(berat, harga);
        System.out.println("Exp Result : "+expResult);
        System.out.println("Result : "+result);

        assertEquals(expResult, result);
    }
    
    @Test(expected = AssertionError.class)
    public void testVoid_HitungTotal1gagal() {
        System.out.println("+hitung total+");
        HChekTarifH instance = new HChekTarifH();
        int expResult = 13000;
        int total = 4000;
        int result = instance.void_hitungtotal1(total);
        System.out.println("Exp Result : "+expResult);
        System.out.println("Result : "+result);
        assertEquals(expResult, result);
    }
    
    @Test (expected = AssertionError.class)
    public void testVoid_kategorigagal() {
        System.out.println("+Chek Kategori+");
        HChekTarifH instance = new HChekTarifH();
        int expResult = 3000;
        String kategori = "Express";
        int result = instance.void_kategori(kategori);
        System.out.println("Exp Result : "+expResult);
        System.out.println("Result : "+result);
        assertEquals(expResult, result);
        
    }
    
    @Test (expected = AssertionError.class)
    public void testVoid_kategorigagal2() {
        System.out.println("+Chek Kategori+");
        HChekTarifH instance = new HChekTarifH();
        int expResult = 3000;
        String kategori = "Express";
        int result = instance.void_kategori(kategori);
        System.out.println("Exp Result : "+expResult);
        System.out.println("Result : "+result);
        assertEquals(expResult, result);
        
    }
    
    @Test 
    public void testVoid_notnullkategori(){
        System.out.println("+Not Null Kategori+");
        String Kategori = "";
        HChekTarifH instance = new HChekTarifH();
        int expResult = instance.void_kategori(Kategori);
        System.out.println("Exp Result : "+expResult);
        assertThat(expResult,is(not(nullValue())));
    }
    
    @Test (expected = NullPointerException.class)
    public void testVoid_nulltotal(){
        System.out.println("+Null Total+");
        Integer berat = null;
        Integer harga = null;
        HChekTarifH instance = new HChekTarifH();
        int expResult = instance.void_hitungtotal(berat, harga);
        System.out.println("Exp Result : "+expResult);
        assertThat(expResult,is(nullValue()));
    }
    
    @Ignore ("This test is Skipped")
    @Test
    public void testIgnore_test(){
        System.out.println("+Skip Void+");
        Integer berat = null;
        int harga = 3000;
        HChekTarifH instance = new HChekTarifH();
        int expResult = instance.void_hitungtotal(berat, harga);
        System.out.println("Skip this Test");
        assertThat(expResult,is(nullValue()));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIllegalArgument_delivery(){
        System.out.println("illegalArgument");
        int berat = -2;
        String kategori = "Paket Kilat";
        int total = 3000;
        delivery instance = new delivery("","","","");
        int expResult = -16000;
        int result = instance.hitung(berat, kategori, total);
        System.out.println("Exp Result : "+expResult);
        System.out.println("Result : "+result);
        assertEquals(expResult, result);
    }
  
}
