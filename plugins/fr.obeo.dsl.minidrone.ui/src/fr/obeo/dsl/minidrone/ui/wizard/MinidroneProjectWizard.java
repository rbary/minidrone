package fr.obeo.dsl.minidrone.ui.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class MinidroneProjectWizard extends Wizard implements INewWizard {
	
	protected MainPage mainPage;

	public MinidroneProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public void addPages() {
		mainPage = new MainPage();
		addPage(mainPage);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.init(workbench, selection);
	}

	@Override
	public boolean performFinish() {
		System.out.println(mainPage.getProjectName());
		return true;
	}

}
