package org.usfirst.frc.team1138.robot.commands;

import org.usfirst.frc.team1138.robot.CommandBase;

public class ShiftBase extends CommandBase {
	public ShiftBase() {
		requires(CommandBase.driveTrain);
	}
	// Called just before this Command runs the first time
	public void initialize()
	{

	}

	// Called repeatedly when this Command is scheduled to run
	public void execute()
	{
		CommandBase.driveTrain.toggleShift();
	}

	// Make this return true when this Command no longer needs to run execute()
	public boolean isFinished()
	{
		return true;
	}

	// Called once after isFinished returns true
	public void end()
	{

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	public void interrupted()
	{

	}
}