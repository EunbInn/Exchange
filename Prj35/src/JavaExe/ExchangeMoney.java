package JavaExe;

import java.io.IOException;

public class ExchangeMoney {
	
	public static void main(String[] args) throws IOException {
		ExchangeMoneyMethods main = new ExchangeMoneyMethods();
		Input input = new Input();
		int inputType, inputMoney;
		
		while(true) {
			inputType = input.inputFromConsoleType();

			if (inputType > 0 && inputType < 4) {
				inputMoney = input.inputFromConsoleMoney();
				String writeResult = main.getMoney(inputType, inputMoney);
				FileReadAndWrite.writeOnFile(writeResult);
			} else if (inputType == 0) {
				break;
			}
		}
		
		
	}
}

