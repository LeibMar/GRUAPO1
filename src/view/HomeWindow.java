package view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;

public class HomeWindow {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			HomeWindow window = new HomeWindow();
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
		shell.setSize(517, 356);
		shell.setText("SWT Application");
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmLocaes = new MenuItem(menu, SWT.CASCADE);
		mntmLocaes.setText("Locações");
		
		Menu menu_5 = new Menu(mntmLocaes);
		mntmLocaes.setMenu(menu_5);
		
		MenuItem mntmNovaLocao = new MenuItem(menu_5, SWT.NONE);
		mntmNovaLocao.setText("Nova locação");
		
		MenuItem mntmEspao = new MenuItem(menu, SWT.CASCADE);
		mntmEspao.setText("Espaço");
		
		Menu menu_3 = new Menu(mntmEspao);
		mntmEspao.setMenu(menu_3);
		
		MenuItem mntmCadastrarEspao = new MenuItem(menu_3, SWT.NONE);
		mntmCadastrarEspao.setText("Cadastrar Espaço");
		
		MenuItem mntmCadastrarGalpo = new MenuItem(menu_3, SWT.NONE);
		mntmCadastrarGalpo.setText("Cadastrar Galpão");
		
		MenuItem mntmContratos = new MenuItem(menu, SWT.CASCADE);
		mntmContratos.setText("Contratos");
		
		Menu menu_4 = new Menu(mntmContratos);
		mntmContratos.setMenu(menu_4);
		
		MenuItem mntmCliente = new MenuItem(menu, SWT.CASCADE);
		mntmCliente.setText("Cliente");
		
		Menu menu_2 = new Menu(mntmCliente);
		mntmCliente.setMenu(menu_2);
		
		MenuItem mntmCadastrarCliente = new MenuItem(menu_2, SWT.NONE);
		mntmCadastrarCliente.setText("Cadastrar Cliente");
		
		MenuItem mntmFuncionario = new MenuItem(menu, SWT.CASCADE);
		mntmFuncionario.setText("Funcionario");
		
		Menu menu_1 = new Menu(mntmFuncionario);
		mntmFuncionario.setMenu(menu_1);
		
		MenuItem mntmCadastrarFuncionrio = new MenuItem(menu_1, SWT.NONE);
		mntmCadastrarFuncionrio.setText("Cadastrar Funcionário");

	}
}
