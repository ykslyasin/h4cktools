package ykslyasin.h4cktools.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ykslyasin.h4cktools.business.abstracts.FavoriteToolsService;
import ykslyasin.h4cktools.core.entities.User;
import ykslyasin.h4cktools.core.utilities.results.DataResult;
import ykslyasin.h4cktools.core.utilities.results.Result;
import ykslyasin.h4cktools.entities.concretes.FavoriteTools;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/favoritetools")
@CrossOrigin
public class FavoriteToolsController {

    private final FavoriteToolsService favoriteToolsService;

    @Autowired
    public FavoriteToolsController(FavoriteToolsService favoriteToolsService) {
        this.favoriteToolsService = favoriteToolsService;
    }

    // Get all favorite tools
    @GetMapping("/getAll")
    public DataResult<List<FavoriteTools>> getAll() {
        return favoriteToolsService.getAll();
    }

    // Add a favorite tool
    @PostMapping("/add")
    public Result add(@RequestBody FavoriteTools favoriteTools) {
        return favoriteToolsService.add(favoriteTools);
    }

    // Get a favorite tool by name
    @GetMapping("/getByName")
    public DataResult<FavoriteTools> getByFavoriteToolsName(@RequestParam String favoriteToolsName) {
        return favoriteToolsService.getByFavoriteToolsName(favoriteToolsName);
    }

    // Get a favorite tool by ID
    @GetMapping("/getById")
    public DataResult<FavoriteTools> getByFavoriteToolsId(@RequestParam int favoriteToolsId) {
        return favoriteToolsService.getByFavoriteToolsId(favoriteToolsId);
    }

    // Get favorite tools by user
   /* @GetMapping("/getByUser")
    public Set<FavoriteTools> getFavoriteToolsByUser(@RequestParam User user) {
        return favoriteToolsService.getFavoriteToolsByUser(user);
    }*/
}