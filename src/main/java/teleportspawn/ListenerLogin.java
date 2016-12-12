package teleportspawn;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.EventListener;
import org.spongepowered.api.event.network.ClientConnectionEvent;
import org.spongepowered.api.world.World;


	public class ListenerLogin implements EventListener<ClientConnectionEvent.Join> {

		TeleportSpawn plugin;
		World world = Sponge.getServer().getWorld("world").get();
		public ListenerLogin(TeleportSpawn plugin) {
			this.plugin = plugin;
		}

		@Override
		public void handle(ClientConnectionEvent.Join event) throws Exception {
			
			Player p = event.getTargetEntity();
			p.setLocation(world.getSpawnLocation());
			

				
			
			
		}

}
