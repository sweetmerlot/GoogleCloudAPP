package com.gcu;
import com.gcu.data.entity.SnakeEntity;
import com.gcu.service.SnakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/snakes")

public class SnakeController {
	@Autowired
	SnakeService snakeService;

	@GetMapping("/addsnakes")
	public String addSnakesMessage(Model model) {
		model.addAttribute("message", "This is where you add the snakes");
		model.addAttribute("snakeModel", new SnakeEntity());
		return "addsnakes";
	}
	@GetMapping("/viewsnakes")
	public String viewSnakesMessage(Model model) {
		model.addAttribute("message", "This is where you view the snakes");
		model.addAttribute("snakes", snakeService.getAll());
		return "viewsnakes";
	}
	@PostMapping("/addsnakes")
	public String doCreateSnake(SnakeEntity snake, BindingResult bindingResult, Model model) {
		System.out.println("SNAKE AGE: " + snake.getCurrentAge());
		snakeService.createSnake(snake);
		model.addAttribute("snakes", snakeService.getAll());
		return "viewsnakes";
	}
}