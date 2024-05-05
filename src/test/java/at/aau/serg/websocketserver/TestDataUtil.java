package at.aau.serg.websocketserver;

import at.aau.serg.websocketserver.domain.dto.*;
import at.aau.serg.websocketserver.domain.entity.GameLobbyEntity;
import at.aau.serg.websocketserver.domain.entity.GameSessionEntity;
import at.aau.serg.websocketserver.domain.entity.PlayerEntity;
import at.aau.serg.websocketserver.domain.pojo.Coordinates;
import at.aau.serg.websocketserver.domain.pojo.GameState;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class TestDataUtil {
    /**
     * id: 1L
     * @param gameLobbyEntity
     * @return
     */
    public static PlayerEntity createTestPlayerEntityA(final GameLobbyEntity gameLobbyEntity){
        return PlayerEntity.builder()
                .id(1L)
                .username("usernameA")
                .gameLobbyEntity(gameLobbyEntity)
                .build();
    }

    /**
     * id: 2L
     * @param gameLobbyEntity
     * @return
     */
    public static PlayerEntity createTestPlayerEntityB(final GameLobbyEntity gameLobbyEntity){
        return PlayerEntity.builder()
                .id(2L)
                .username("usernameB")
                .gameLobbyEntity(gameLobbyEntity)
                .build();
    }

    /**
     * id: 3L
     * @param gameLobbyEntity
     * @return
     */
    public static PlayerEntity createTestPlayerEntityC(final GameLobbyEntity gameLobbyEntity){
        return PlayerEntity.builder()
                .id(3L)
                .username("usernameC")
                .gameLobbyEntity(gameLobbyEntity)
                .build();
    }
    public static PlayerEntity createTestPlayerEntityD(final GameLobbyEntity gameLobbyEntity){
        return PlayerEntity.builder()
                .id(null)
                .username("usernameD")
                .gameLobbyEntity(gameLobbyEntity)
                .build();
    }
    public static PlayerEntity createTestPlayerEntityE(final GameLobbyEntity gameLobbyEntity){
        return PlayerEntity.builder()
                .id(null)
                .username("usernameE")
                .gameLobbyEntity(gameLobbyEntity)
                .build();
    }
    public static PlayerEntity createTestPlayerEntityF(final GameLobbyEntity gameLobbyEntity){
        return PlayerEntity.builder()
                .id(null)
                .username("usernameF")
                .gameLobbyEntity(gameLobbyEntity)
                .build();
    }

    public static PlayerEntity createTestPlayerEntityG(final GameLobbyEntity gameLobbyEntity){
        return PlayerEntity.builder()
                .id(null)
                .username("usernameG")
                .gameLobbyEntity(gameLobbyEntity)
                .build();
    }


    public static GameLobbyEntity createTestGameLobbyEntityA() {
        Timestamp timeStamp = Timestamp.valueOf("2024-03-26 15:00:00.000");
        return GameLobbyEntity.builder()
                .id(1L)
                .name("lobbyA")
                .gameStartTimestamp(timeStamp)
                .gameState(GameState.LOBBY.toString())
                .numPlayers(0)
                .build();
    }

    public static GameLobbyEntity createTestGameLobbyEntityB() {
        Timestamp timeStamp = Timestamp.valueOf("2024-03-26 15:01:00.000");
        return GameLobbyEntity.builder()
                .id(2L)
                .name("lobbyB")
                .gameStartTimestamp(timeStamp)
                .gameState(GameState.LOBBY.toString())
                .numPlayers(0)
                .build();
    }

    public static GameLobbyEntity createTestGameLobbyEntityC() {
        Timestamp timeStamp = Timestamp.valueOf("2024-03-26 15:02:00.000");
        return GameLobbyEntity.builder()
                .id(3L)
                .name("lobbyC")
                .gameStartTimestamp(timeStamp)
                .gameState(GameState.LOBBY.toString())
                .numPlayers(0)
                .build();
    }

    public static PlayerDto createTestPlayerDtoA(Long gameLobbyId) {

        return PlayerDto.builder()
                .id(1L)
                .username("usernameA")
                .gameLobbyId(gameLobbyId)
                .build();
    }

    public static GameLobbyDto createTestGameLobbyDtoA() {
        Timestamp timeStamp = Timestamp.valueOf("2024-03-26 15:00:00.000");
        return GameLobbyDto.builder()
                .id(1L)
                .name("lobbyA")
                .gameStartTimestamp(timeStamp)
                .gameState(GameState.LOBBY)
                .numPlayers(0)
                .build();
    }

    public static GameLobbyDto createTestGameLobbyDtoB() {
        Timestamp timeStamp = Timestamp.valueOf("2024-03-26 15:00:00.000");
        return GameLobbyDto.builder()
                .id(2L)
                .name("lobbyB")
                .gameStartTimestamp(timeStamp)
                .gameState(GameState.LOBBY)
                .numPlayers(0)
                .build();
    }

    public static GameSessionDto createTestGameSessionDtoA(PlayerDto lobbyCreator) {
        return GameSessionDto.builder()
                .id(1L)
                .turnPlayerId(lobbyCreator.getId())
                .gameState(GameState.IN_GAME)
                .playerIds(null)
                .build();
    }

    public static GameSessionEntity createTestGameSessionEntityA(PlayerEntity lobbyCreator) {
        return GameSessionEntity.builder()
                .id(1L)
                .turnPlayerId(lobbyCreator.getId())
                .gameState(GameState.IN_GAME.toString())
                .playerIds(null)
                .build();
    }

    public static TileDeckDto createTestTileDeckDtoA(Long gameSessionId) {
        return TileDeckDto.builder()
                .id(1L)
                .tileId(null)
                .gameSessionId(gameSessionId)
                .build();
    }

    public static GameSessionEntity createTestGameSessionEntityWith3Players(){
        List<Long> playerIds = new ArrayList<>();
        playerIds.add(1L);
        playerIds.add(2L);
        playerIds.add(3L);

        return GameSessionEntity.builder()
                .id(1L)
                .turnPlayerId(1L)
                .gameState(GameState.IN_GAME.toString())
                .playerIds(playerIds)
                .numPlayers(3)
                .tileDeck(null)
                .build();
    }

    public static PlacedTileDto createTestPlacedTileDto(Long gameSessionId) {
        return PlacedTileDto.builder()
                .gameSessionId(gameSessionId)
                .tileId(1L)
                .coordinates(new Coordinates(12,12))
                .rotation(1)
                .build();
    }
}
