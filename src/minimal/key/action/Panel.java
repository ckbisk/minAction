package minimal.key.action;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.util.logging.Logger;

import javax.swing.Action;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Panel extends JPanel {
	Panel() {
		getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), UP);
		getActionMap().put(UP, new Action() {

			@Override
			public void actionPerformed(ActionEvent event) {
				warn(event.toString());
			}

			@Override
			public void setEnabled(boolean b) {
				warn("calously ignoring attempt to setEnabled(" + b);
			}

			@Override
			public void removePropertyChangeListener(
					PropertyChangeListener listener) {
				warn("blaziely ignoring attempt to removePropertyChangeListener("
						+ listener);
			}

			@Override
			public void putValue(String key, Object value) {
				warn("you can't make me putValue(" + key + ", " + value);
			}

			@Override
			public boolean isEnabled() {
				warn("isEnabled() returning true - you can't disable me!");
				return true;
			}

			@Override
			public Object getValue(String key) {
				warn("getValue(" + key + ") returning hardcoded null");
				return null;
			}

			@Override
			public void addPropertyChangeListener(
					PropertyChangeListener listener) {
				warn("ignoring addPropertyChangeListener(" + listener + ")");
			}
		});
	}

	private void warn(String msg) {
		Logger.getLogger(getClass().getName()).warning(msg);
	}

	private static final String UP = "up";
	private static final long serialVersionUID = 1L;
}
