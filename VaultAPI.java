package ru.witwar.apm.apimaster;

import org.bukkit.entity.Player;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import ru.witwar.apm.apimaster.enums.Action;
import ru.witwar.apm.apimaster.enums.BankType;

public class VaultAPI {
	
	private Economy econ;
	private Chat chat;
	
	public Economy getVaultEconomyAPI() {
		return econ;
	}
	
	public Chat getVaultChatAPI() {
		return chat;
	}
	
	public double vaultEconomyGetBalance(Player player) {
		return econ.getBalance(player);
	}
	
	public void vaultEconomySetBalance(Player player, Action action, double number) {
		
		if(action == Action.DEPOSIT) {
			econ.depositPlayer(player, number);
		}
		if(action == Action.WITHDRAW) {
			econ.withdrawPlayer(player, number);
		}
		if(action == Action.WITHDRAW_ALL) {
			econ.withdrawPlayer(player, econ.getBalance(player));
		}
		
	}
	
	public void vaultEconomyBankResponse(String Bank, double number, Action action) {
		
		if(action == Action.DEPOSIT) {
			econ.bankDeposit(Bank, number);
		}
		if(action == Action.WITHDRAW) {
			econ.bankWithdraw(Bank, number);
		}
		if(action == Action.WITHDRAW_ALL) {
			econ.bankWithdraw(Bank, Double.parseDouble(econ.bankBalance(Bank).toString()));
		}
		
	}
	
	public EconomyResponse vaultEconomyBankBalance(String bank) {
		
		return econ.bankBalance(bank);
		
	}
	
	public boolean vaultEconomyHasBank(String bank, double number) {
		if(Boolean.parseBoolean(econ.bankHas(bank, number).toString())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@SuppressWarnings("deprecation")
	public void vaultEconomyBankCreate(Player player, String bank, BankType type) {
		
		if(type == BankType.DEPRICATED) {
			econ.createBank(bank, player.getName());
		}
		else {
			econ.createBank(bank, player);
		}
		
	}
	
	public boolean vaultEconomyPlayerAccountCreate(Player player) {
		
		if(econ.createPlayerAccount(player)) {
			econ.createPlayerAccount(player);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean vaultChatGetGroupInfoBoolean(String arg0, String arg1, String arg2, boolean arg3) {
		
		return chat.getGroupInfoBoolean(arg0, arg1, arg2, arg3);
		
	}
	

}
