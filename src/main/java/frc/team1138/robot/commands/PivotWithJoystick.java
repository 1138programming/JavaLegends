package frc.team1138.robot.commands;

import frc.team1138.robot.CommandBase;

public class PivotWithJoystick extends CommandBase
{
	public PivotWithJoystick()
	{
		requires(CommandBase.pivot);
	}

	// Called just before this Command runs the first time
	public void initialize()
	{

	}

	// Called repeatedly when this Command is scheduled to run
	public void execute()
	{
		CommandBase.pivot.pivotRunToLimit(oi.getLeftXBoxAxis());
	}

	// Make this return true when this Command no longer needs to run execute()
	public boolean isFinished()
	{
		return false;
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