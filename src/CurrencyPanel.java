/*
 * by H�seyin BEYAN
 * vers 1.0   22.04.2015
 * 
 * Panel to show currency of the user of the game, it shows the amount of coins and crystals, also 
 * it will be placed in every panel of the project
 */

import java.awt.*;
import javax.swing.*;

public class CurrencyPanel extends JPanel {
	
	private int coin;	
	private int crystal;
	private Statistics stats;	
	private JLabel coinLabel;
	private JLabel crysLabel;

	/**
	 * Create the panel.
	 */
	public CurrencyPanel( Statistics stat)
	{
		stats = stat;
		
		coin = stats.getCoin();
		crystal = stats.getCrystal();
		
		setLayout(null);
		
		setBounds( 0, 0, 100,50);
		
		setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1,Color.black));
		 
		coinLabel = new JLabel( coin + "");
		coinLabel.setBounds(35, 5, 46, 14);
		add(coinLabel);
		
		crysLabel = new JLabel( crystal + "");
		crysLabel.setBounds(35, 30, 46, 14);
		add(crysLabel);
		
		JLabel coinPict = new JLabel("");
		coinPict.setIcon(new ImageIcon("images/coin.jpg"));
		coinPict.setBounds(2, 2, 17, 21);
		add(coinPict);
		
		JLabel crysPict = new JLabel("");
		crysPict.setIcon(new ImageIcon("images/crystal.jpg"));
		crysPict.setBounds(2, 27, 21, 21);
		add(crysPict);
		
		setBackground( Color.WHITE);

	}
	
	public void paintComponent( Graphics g)
	{
		super.paintComponent( g);
		
		g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
		
		g.drawLine(this.getHeight() / 2, 0, this.getHeight() / 2,  this.getWidth() / 2);
	}
	
	public void update( Statistics stat)
	{
		coin = stat.getCoin();
		crystal = stat.getCrystal();
		
		coinLabel.setText(coin + "");
		crysLabel.setText( crystal + "");
	}
	
}
