package teleportspawn;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.EventListener;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.world.World;

public class ListenerLogout implements EventListener<ClientConnectionEvent.Disconnect> {

	TeleportSpawn plugin;
	World world = Sponge.getServer().getWorld("world").get();
	public ListenerLogout(TeleportSpawn plugin) {
		this.plugin = plugin;
	}

	@Override
	public void handle(ClientConnectionEvent.Disconnect event) throws Exception {
		
		Player p = event.getTargetEntity();
		p.setLocation(world.getSpawnLocation());
		

			
		
		
	}

}
