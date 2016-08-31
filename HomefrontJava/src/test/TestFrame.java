package test;

import javax.swing.JFrame;

import data.Unit;
import data.UnitType;
import visual.UnitAttributes;

public class TestFrame extends JFrame {
	public TestFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Unit unit = new Unit("Sturmtruppe", "Eine stürmische Truppe", UnitType.Infanterie, 20, 75, 1, 50, 3, 10, 1, 2);
		this.add(new UnitAttributes(unit));
		this.pack();
		this.setVisible(true);
	}
}
