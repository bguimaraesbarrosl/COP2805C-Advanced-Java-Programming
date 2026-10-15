package com.example.harrypotter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CharacterController {

    @Autowired
    private WizardCharacterRepository repository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("wizardCharacter", new WizardCharacter());
        return "form";
    }

    @PostMapping("/submitCharacter")
    public String submitForm(@ModelAttribute WizardCharacter wizardCharacter, Model model) {
        repository.save(wizardCharacter);
        model.addAttribute("wizardCharacter", wizardCharacter);
        return "result";
    }
}