package fr.obeo.dsl.minidrone.ui.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;

public class MainPage extends WizardPage {
	private Composite container;
	private Text projectName;
	

	public MainPage() {
		super("Create a new Minidrone Project");
		setTitle("Create a new Minidrone Project");
		setDescription("Enter a project name");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		
		projectName = new Text(container, SWT.BORDER | SWT.SINGLE);
		projectName.setText("");
		projectName.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (!projectName.getText().isEmpty()) {
					setPageComplete(true);
				}
			}
		});
		
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		projectName.setLayoutData(gridData);
		
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);
	}

	
	public Text getProjectName() {
		return projectName;
	}

	public void setProjectName(Text projectName) {
		this.projectName = projectName;
	}
}
