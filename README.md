# Dagger Across Modules

This is a sample project to validate how [dagger](https://github.com/google/dagger) would be able to inject dependencies across android modules.

### Architecture

For this project, we have two Android modules: `app` and `vehicles` and three dagger modules, like so:

![architecture diagram](https://raw.githubusercontent.com/julioz/daggeracrossmodules/master/architecture_diagram.png)

The app component includes the three modules and Dagger will wire up the dependencies by instantiating classes from each of them: the `vehicles` module contains interfaces that are implemented by concrete classes from the `app` module, and we also have an example of `@Named` injection from the `vehicles` module into the `app` module.
