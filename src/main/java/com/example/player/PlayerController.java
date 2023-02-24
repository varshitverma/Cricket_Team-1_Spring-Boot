/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import com.example.player.PlayerService;
import com.example.player.Player;

@RestController
 class PlayerController {
   PlayerService playerService = new PlayerService();
   
   //API-1 -> Get All Players
   @GetMapping("/players")
   public ArrayList<Player> getPlayers() {
      return playerService.getPlayers();
   }

   //API-2 -> Post New Player
   @PostMapping("/players")   
   public Player addPlayer(@RequestBody Player player) {
      return playerService.addPlayer(player);
   }
   
   //API-3 -> Get Player By ID
   @GetMapping("/players/{playerId}")
   public Player getPlayerById(@PathVariable("playerId") int playerId) {
      return playerService.getPlayerById(playerId);
   }

   //API-4 -> Update Player By ID
   @PutMapping("/players/{playerId}")
   public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
      return playerService.updatePlayer(playerId, player);
   }

   //API-5 -> Delete Player By ID
   @DeleteMapping("/players/{playerId}")
   public void deletePlayer(@PathVariable("playerId") int playerId) {
      playerService.deletePlayer(playerId);
   }

 }