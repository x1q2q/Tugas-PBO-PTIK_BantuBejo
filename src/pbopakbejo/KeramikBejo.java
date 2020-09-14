/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbopakbejo;

/**
 *
 * @author rafikbojes
 */

public class KeramikBejo {
    int luasTanah,panjang,lebar,harga,isi,hargaMurah;
    String tipeMurah;
    
    float luasKeramik(){
      return this.panjang*this.lebar;
    };
    float luasTanahCM(){
        return this.luasTanah*100;
    };
    int hitungHarga(){
        return this.hitungBox() * this.harga;
    };
    int hitungBox(){
      double hasil =  (this.luasTanahCM()/this.luasKeramik() * 100)/this.isi;
      return (int) Math.round(hasil); 
    };
}
