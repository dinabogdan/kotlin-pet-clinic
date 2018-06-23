package com.freesoft.kotlinpetclinic

import com.freesoft.kotlinpetclinic.service.PetOwnerService
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinPetClinicApplicationTests {

    @Autowired
    lateinit var petOwnerService: PetOwnerService

    @Test
    fun contextLoads() {
        Assert.assertNotNull(petOwnerService)
    }

    @Test
    fun testPetOwnerService() {
        val petOwner = petOwnerService.findPetOwnerByFirstNameAndLastName("Cristiano", "Ronaldo")
        println(petOwner)
    }
}
