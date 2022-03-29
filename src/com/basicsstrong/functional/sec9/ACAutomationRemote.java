package com.basicsstrong.functional.sec9;

class ACAutomationRemote {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}
}
