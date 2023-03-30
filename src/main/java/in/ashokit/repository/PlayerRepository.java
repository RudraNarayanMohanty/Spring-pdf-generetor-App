package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}
