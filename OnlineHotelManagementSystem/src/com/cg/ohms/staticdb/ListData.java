package com.cg.ohms.staticdb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cg.ohms.dao.ACRoomDetails;
import com.cg.ohms.dao.Bookingdetails;
import com.cg.ohms.dao.HotelDetails;
import com.cg.ohms.dao.KingRoomDetails;
import com.cg.ohms.dao.NonACRoomDetails;
import com.cg.ohms.dao.QueenRoomDetails;


public class ListData {
	public void puneHotelList()
	{
		List<String> mukundnagar=new ArrayList<>();
		mukundnagar.add("Hotel Paradise");
		mukundnagar.add("Hotel RajLakshmai");
		
		
		List<String> sahakarnagar=new ArrayList<>();
		sahakarnagar.add("Hotel CityPlus");
		sahakarnagar.add("Hotel Mankind");
		
		List<String> delhiHotel=new ArrayList<>();
		delhiHotel.add("Hotel Heaven");
		delhiHotel.add("Hotel DharmLakshmai");
		
		
		List<String> mumbaiHotel=new ArrayList<>();
		mumbaiHotel.add("Hotel Taj");
		mumbaiHotel.add("Hotel Obroi");
		
	}
	public void jaipurHotelList()
	{
		List<String> malviyanagar=new ArrayList<>();
		malviyanagar.add("Hotel Raddison");
		malviyanagar.add("Hotel Marriot");
		
		List<String> jhotwara=new ArrayList<>();
		jhotwara.add("Hotel Nalanda");
		jhotwara.add("Hotel Rampur");
		
		List<String> kartarpura=new ArrayList<>();
		kartarpura.add("Hotel Khalsa");
		kartarpura.add("Hotel Toytoy");
		
		List<String>sanganer=new ArrayList<>();
		sanganer.add("Hotel SaiDharsan");
		sanganer.add("Hotel BellaCasa");
	}
	public void mumbaiHotelList()
	{
		List<String> thane=new ArrayList<>();
		thane.add("Hotel JayShree");
		thane.add("Hotel Marriot");
		
		List<String> andheri=new ArrayList<>();
		andheri.add("Hotel Mango");
		andheri.add("Hotel Rampur");
		
		List<String> bandra=new ArrayList<>();
		bandra.add("Hotel Alka");
		bandra.add("Hotel Ginger");
		
		List<String>civillines=new ArrayList<>();
		civillines.add("Hotel SaiDharsan");
		civillines.add("Hotel BellaCasa");
	}
	public void delhiHotelList()
	{
		List<String>mukherjinagar=new ArrayList<>();
		mukherjinagar.add("Hotel JayShree");
		mukherjinagar.add("Hotel Marriot");
		
		List<String>rajivchowk=new ArrayList<>();
		rajivchowk.add("Hotel Mango");
		rajivchowk.add("Hotel Rampur");
		
		List<String>hauzkaus=new ArrayList<>();
		hauzkaus.add("Hotel Alka");
		hauzkaus.add("Hotel Ginger");
		
		List<String>rajendranagar=new ArrayList<>();
		rajendranagar.add("Hotel SaiDharsan");
		rajendranagar.add("Hotel BellaCasa");
	}
	public List cityList()
	{
		List<String> citylist = new ArrayList<>();
		citylist.add("PUNE");
		citylist.add("JAIPUR");
		citylist.add("MUMBAI");
		citylist.add("DELHI");
		return citylist;
	}
	public List areaListPune()
	{
		List<String> arealistpune = new ArrayList<>();
		arealistpune.add("MukundNagar");
		arealistpune.add("Sahakarnagar");
		arealistpune.add("Ganeshkhind");
		arealistpune.add("Baner");
		return arealistpune;
	}
	public List areaListJaipur()
	{
		List<String> arealistjaipur = new ArrayList<>();
		arealistjaipur.add("MalviyaNagar");
		arealistjaipur.add("Jhotwara");
		arealistjaipur.add("Kartarpura");
		arealistjaipur.add("Sanganer");
		return arealistjaipur;
	}
	public List areaListMumbai()
	{
		List<String> arealistmumbai = new ArrayList<>();
		arealistmumbai.add("Thane");
		arealistmumbai.add("Andheri");
		arealistmumbai.add("Bandra");
		arealistmumbai.add("CivilLines");
		return arealistmumbai;
	}
	public List areaListDelhi()
	{
		List<String> arealistdelhi = new ArrayList<>();
		arealistdelhi.add("MukherjiNagar");
		arealistdelhi.add("RajivChowk");
		arealistdelhi.add("HauzKaus");
		arealistdelhi.add("RajendraNagar");
		return arealistdelhi;
	}
	public List hotelList()
	{
		List<HotelDetails> hotellist=new ArrayList<>();
		hotellist.add(new HotelDetails(1,"Paradise","ABC Colony",4));
		hotellist.add(new HotelDetails(2,"Taj","XYZ Colony",4));
		return hotellist;
	}
	public List kingRoomList()
	{
		List<KingRoomDetails> kingroomdetail=new ArrayList<>();
		kingroomdetail.add(new KingRoomDetails(1, false, 3000, 3));
		return kingroomdetail;
		
	}
	public List queenRoomList()
	{
		List<QueenRoomDetails> queenroomdetail=new ArrayList<>();
		queenroomdetail.add(new QueenRoomDetails(1,false,2800,2));
		return queenroomdetail;
		
	}
	public List acRoomList()
	{
		List<ACRoomDetails> acroomdetail=new ArrayList<>();
		acroomdetail.add(new ACRoomDetails(1, false, 2500, 2));
		return acroomdetail;
		
	}
	public List nonACRoomList()
	{
		List<NonACRoomDetails> nonacroomdetail=new ArrayList<>();
		nonacroomdetail.add(new NonACRoomDetails(1, false, 2000, 2));
		return nonacroomdetail;
		
	}
	public List typeOfRoom()
	{
		List<String> typeofroom=new ArrayList<>();
		typeofroom.add("KingSize");
		typeofroom.add("QueenSize");
		typeofroom.add("AC");
		typeofroom.add("NonAc");
		return typeofroom;
	}
	public List bookingId()
	{
		List<Integer> bookingid=new ArrayList<Integer>();
		bookingid.add(678568);
		bookingid.add(458296);
		bookingid.add(392817);
		bookingid.add(945173);
		return bookingid;
	}
	
	public List bookingDetailList() {
		List<Bookingdetails> bookdetail=new ArrayList<>();
		
		try {
		bookdetail.add(new Bookingdetails(678568,new SimpleDateFormat("dd-MM-yyyy").parse("22-06-2019"),new SimpleDateFormat("dd-MM-yyyy").parse("23-06-2019"),3000));
		bookdetail.add(new Bookingdetails(458296,new SimpleDateFormat("dd-MM-yyyy").parse("12-06-2019"),new SimpleDateFormat("dd-MM-yyyy").parse("15-06-2019"),5000));
		bookdetail.add(new Bookingdetails(392817,new SimpleDateFormat("dd-MM-yyyy").parse("17-06-2019"),new SimpleDateFormat("dd-MM-yyyy").parse("20-06-2019"),4000));
		bookdetail.add(new Bookingdetails(945173,new SimpleDateFormat("dd-MM-yyyy").parse("02-06-2019"),new SimpleDateFormat("dd-MM-yyyy").parse("06-06-2019"),4000));
		}
		catch (ParseException e) {
			// TODO: handle exception
		}
		return bookdetail;
	}
	
	
	
		

	
	

	
}
