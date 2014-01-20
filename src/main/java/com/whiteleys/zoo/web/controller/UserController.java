package com.whiteleys.zoo.web.controller;

import com.whiteleys.zoo.domain.Animal;
import com.whiteleys.zoo.service.AnimalService;
import com.whiteleys.zoo.web.Tiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Collections;

/**
 * The controller that deals with all non-form processing requests that can be submitted by a user.
 */
@org.springframework.stereotype.Controller
public class UserController {

    private AnimalService animalService;

    /**
     * Proceed to the home page that shows all a user's favorites.
     *
     * @param session the http session
     * @return the model and view
     */
    @RequestMapping("/home.html")
    public ModelAndView home(HttpSession session) {

        // TODO Get the favourites for the logged-in user
        List<Animal> favourites = Collections.EMPTY_LIST;

        return new ModelAndView(Tiles.HOME)
                .addObject("favourites", favourites);
    }

    /**
     * Logout from the application, redirecting to the login page when done.
     *
     * @param session the http session
     * @return the model and view
     */
    @RequestMapping("/logout.html")
    public ModelAndView logout(HttpSession session) {
        session.setAttribute("user", null);  // clear the user from the session
        return new ModelAndView("redirect:/login.html");     // return to the login page
    }

    /**
     * View the gallery of all available images.
     *
     * @param session the http session
     * @return the model and view
     */
    @RequestMapping("/gallery.html")
    public ModelAndView gallery(HttpSession session) {

        // retrieve a list of all the image files that are available
        List<Animal> allAnimals = animalService.getAllAnimals();

        // TODO populate list of the user's favourite animals
        List<Animal> favouriteAnimals = Collections.EMPTY_LIST;

        return new ModelAndView(Tiles.GALLERY)
                .addObject("favourites", favouriteAnimals)
                .addObject("allAnimals", allAnimals);
    }

    /**
     * Add a favourite to the user's collection.
     *
     * @param session  the http session
     * @param animalId the animal ID
     * @return the model and view
     */
    @RequestMapping("/addFavourite.html")
    public ModelAndView addFavourite(HttpSession session, @RequestParam Long animalId) {

        // TODO - add favourite

        return new ModelAndView("redirect:/gallery.html");
    }

    /**
     * Remove a favourite from the user's collection.
     *
     * @param session  the http session
     * @param animalId the animal Id
     * @param gallery  true to return to the gallery page, otherwise the user will be redirected to
     *                 the home page.
     * @return the model and view
     */
    @RequestMapping("/removeFavourite.html")
    public ModelAndView removeFavourite(
            HttpSession session,
            @RequestParam Long animalId,
            @RequestParam(required = false) Boolean gallery) {

        boolean redirectToGallery = (gallery != null && gallery);

        // TODO Remove favourite

        return new ModelAndView(
                redirectToGallery ? "redirect:/gallery.html" : "redirect:/home.html");
    }

    @Autowired
    public void setAnimalsService(AnimalService animalService) {
        this.animalService = animalService;
    }

}
