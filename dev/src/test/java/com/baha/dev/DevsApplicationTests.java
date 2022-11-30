package com.baha.dev;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baha.dev.entities.Projet;
import com.baha.dev.entities.Dev;
import com.baha.dev.repos.DevRepository;
@SpringBootTest
class DevsApplicationTests {
@Autowired
private DevRepository devRepository;
@Test
public void testCreateDev() {
Dev dev = new Dev("Bachir",250.500,new Date());
devRepository.save(dev);
}
@Test
public void testFindDev()
{
Dev p = devRepository.findById(1L).get();

System.out.println(p);
}
@Test
public void testUpdateDev()
{
Dev p = devRepository.findById(1L).get();
p.setsalaireDev(1000.0);
devRepository.save(p);
}

@Test
public void testDeleteDev()
{
devRepository.deleteById(1L);
}

@Test
public void testListerTousDevs()
{
List<Dev> prods = devRepository.findAll();
for (Dev p : prods)
{
System.out.println(p);
}

}

@Test
public void testFindByNomDev()
{
List<Dev> prods = devRepository.findByNomDev("iphone X");

for (Dev p : prods)
{
System.out.println(p);
}

}

@Test
public void testFindByNomDevContains ()
{
List<Dev> prods=devRepository.findByNomDevContains("P");

for (Dev p : prods)
{
System.out.println(p);
} }
@Test
public void testfindByNomPrix()
{
List<Dev> prods = devRepository.findByNomPrix("iphone X", 1000.0);
for (Dev p : prods)
{
System.out.println(p);
}

}
@Test
public void testfindByCategorie()
{
Projet cat = new Projet();
cat.setIdPoj(1L);
List<Dev> prods = devRepository.findByProjet(cat);
for (Dev p : prods)
{
System.out.println(p);
}

}


@Test
public void findByCategorieIdCat()
{
List<Dev> prods = devRepository.findByProjetIdPoj(1L);
for (Dev p : prods)
{
System.out.println(p);
}

}
@Test
public void testfindByOrderByNomDevAsc()
{
List<Dev> prods =

devRepository.findByOrderByNomDevAsc();
for (Dev p : prods)
{
System.out.println(p);
}

}
@Test
public void testTrierDevsNomsPrix()
{
List<Dev> prods = devRepository.trierDevNomsSalaire();
for (Dev p : prods)
{
System.out.println(p);
}

}
}




















