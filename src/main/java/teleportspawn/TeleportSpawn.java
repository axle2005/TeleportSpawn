package teleportspawn;

import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.EventListener;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartingServerEvent;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;



@Plugin(id = "teleportspawn", name = "TeleportSpawn")
public class TeleportSpawn {


	@Inject
	private Logger log;
	
	@Listener
	public void initialization(GameStartingServerEvent event) {
		EventListener<ClientConnectionEvent.Join> listenerlogin = new ListenerLogin(this);
		Sponge.getEventManager().registerListener(this, ClientConnectionEvent.Join.class, listenerlogin);
		
		
		EventListener<ClientConnectionEvent.Disconnect> listenerlogout = new ListenerLogout(this);
		Sponge.getEventManager().registerListener(this, ClientConnectionEvent.Disconnect.class, listenerlogout);
	}
	
	public Logger getLogger() {
		return log;
	}
}
