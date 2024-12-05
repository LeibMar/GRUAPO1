package view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class Login {

	protected Shell shell;
	private Text txtUserName;
	private Text txtUserPassword;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(467, 356);
		shell.setText("SWT Application");
		
		Label lblLogin = new Label(shell, SWT.NONE);
		lblLogin.setBounds(191, 32, 37, 15);
		lblLogin.setText("Login");
		
		Label labelUserName = new Label(shell, SWT.NONE);
		labelUserName.setText("Nome e Sobrenome");
		labelUserName.setBounds(94, 87, 116, 15);
		
		Label labelUserSenha = new Label(shell, SWT.NONE);
		labelUserSenha.setText("Senha");
		labelUserSenha.setBounds(94, 149, 37, 15);
		
		txtUserName = new Text(shell, SWT.BORDER);
		txtUserName.setBounds(94, 108, 227, 21);
		
		txtUserPassword = new Text(shell, SWT.BORDER);
		txtUserPassword.setBounds(94, 170, 227, 21);
		
		Button btnAcessar = new Button(shell, SWT.NONE);
		btnAcessar.setBounds(177, 220, 75, 25);
		btnAcessar.setText("Acessar");

	}

}
