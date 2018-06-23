package com.freesoft.kotlinpetclinic.repository

import com.freesoft.kotlinpetclinic.domain.PetOwner
import com.freesoft.kotlinpetclinic.domain.Speciality
import com.freesoft.kotlinpetclinic.domain.Type
import com.freesoft.kotlinpetclinic.domain.Veterinary
import com.freesoft.kotlinpetclinic.service.*
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DefaultRunner(private val veterinaryService: VeterinaryService,
                    private val specialityService: SpecialityService,
                    private val petOwnerService: PetOwnerService,
                    private val petService: PetService,
                    private val typeService: TypeService) : CommandLineRunner {
    override fun run(vararg args: String?) {
        var speciality1 = Speciality(null, "SmallPets")
        var speciality2 = Speciality(null, "Medium Pets")
        var speciality3 = Speciality(null, "Big Pets")
        specialityService.createVeterinarySpeciality(speciality1)
        specialityService.createVeterinarySpeciality(speciality2)
        specialityService.createVeterinarySpeciality(speciality3)

        var firstSet = setOf<Speciality>(speciality1)
        var secondSet = setOf<Speciality>(speciality1, speciality2)
        var thirdSet = setOf<Speciality>(speciality1, speciality2, speciality3)

        var vet1 = Veterinary("John", "Doe", firstSet)
        var vet2 = Veterinary("Freddy", "Krugger", secondSet)
        var vet3 = Veterinary("Bob", "Marley", thirdSet)

        veterinaryService.createVeterinary(vet1)
        veterinaryService.createVeterinary(vet2)
        veterinaryService.createVeterinary(vet3)

        var petOwner1 = PetOwner("Cristiano", "Ronaldo")
        var petOwner2 = PetOwner("Leo", "Messi")
        var petOwner3 = PetOwner("Zinedine", "Zidane")

        petOwnerService.createPetOwner(petOwner1)
        petOwnerService.createPetOwner(petOwner2)
        petOwnerService.createPetOwner(petOwner3)

        var type1 = Type("Dogs")
        var type2 = Type("Cats")
        var type3 = Type("Fishes")

        typeService.createNewType(type1)
        typeService.createNewType(type2)
        typeService.createNewType(type3)
    }
}