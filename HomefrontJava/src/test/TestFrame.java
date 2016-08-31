package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.thoughtworks.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import javax.swing.JButton;
import javax.swing.JFrame;

import data.MinMax;
import data.Unit;
import data.UnitType;
import data.Weapon;
import visual.UnitAttributes;

public class TestFrame extends JFrame {
	Unit unit;

	public TestFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Weapon weapon = new Weapon("MG", 1000, new MinMax(1, 1), new MinMax(2, 5), new MinMax(2, 5), new MinMax(2, 5), new MinMax(2, 5), new MinMax(2, 5), new MinMax(2, 5), new MinMax(2, 5));
		unit = new Unit("Sturmtruppe", "Eine stürmische Truppe", UnitType.Infanterie, 20, 75, 1, 50, 3, 10, 1, 2, weapon);
		
		XStream xstream = new XStream(new DomDriver());
		String xml = xstream.toXML(unit);
		System.out.println(xml);
		
		unit = null;
		unit = (Unit) xstream.fromXML(xml);
		
		
		this.add(new UnitAttributes(unit));
		this.pack();
		this.setVisible(true);
	}
}
