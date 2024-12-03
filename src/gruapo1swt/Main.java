package gruapo1swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import model.Agenda;
import model.Cliente;
import model.Espaco;
import model.Funcionario;
import model.Locacao;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Main {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
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
		shell.setSize(450, 300);
		shell.setText("Shelf Storage");
		
		Button btnNovoEspaco = new Button(shell, SWT.NONE);
		btnNovoEspaco.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnNovoEspaco.setBounds(10, 36, 121, 25);
		btnNovoEspaco.setText("Novo Espaço");
		
		btnNovoEspaco.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                // Chamar a função que dispara a inserção de um novo espaço
                Espaco.InserirEspaco();
            }
        });
		
		
		Button btnNovoFuncionario = new Button(shell, SWT.NONE);
		btnNovoFuncionario.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNovoFuncionario.setBounds(154, 36, 121, 25);
		btnNovoFuncionario.setText("Novo Funcionario");
		
		btnNovoFuncionario.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                // Chamar a função que dispara a inserção de um novo espaço
                Funcionario.InserirFuncionario();
            }
        });
		
		Button btnNovoCliente = new Button(shell, SWT.NONE);
		btnNovoCliente.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNovoCliente.setBounds(303, 36, 121, 25);
		btnNovoCliente.setText("Novo Cliente");
		
		btnNovoCliente.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                // Chamar a função que dispara a inserção de um novo espaço
                Cliente.InserirCliente();
            }
        });
		
		Button btnNovaAgenda = new Button(shell, SWT.NONE);
		btnNovaAgenda.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNovaAgenda.setBounds(79, 82, 121, 25);
		btnNovaAgenda.setText("Nova Agenda");
		
		btnNovaAgenda.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                // Chamar a função que dispara a inserção de um novo espaço
                Agenda.InserirAgenda();
            }
        });
		
		Button btnNovaLocacao = new Button(shell, SWT.NONE);
		btnNovaLocacao.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNovaLocacao.setBounds(232, 82, 121, 25);
		btnNovaLocacao.setText("Nova Locacao");
		
		btnNovaLocacao.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                // Chamar a função que dispara a inserção de um novo espaço
                Locacao.InserirLocacao();
            }
        });

	}
}
