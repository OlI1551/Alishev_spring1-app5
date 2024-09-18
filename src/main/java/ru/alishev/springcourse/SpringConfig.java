package ru.alishev.springcourse;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:musicPlayer5.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic()); // внедрили бины
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer()); // внедрили бин
    }
}
