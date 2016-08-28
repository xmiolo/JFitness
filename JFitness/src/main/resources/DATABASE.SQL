-- Table: public.pessoa

-- DROP TABLE public.pessoa;

CREATE TABLE pessoa
(
  cdpessoa integer NOT NULL,
  nome character varying(200) NOT NULL,
  senha character varying(200) NOT NULL,
  email character varying(200) NOT NULL,
  endereco character varying(200),
  cidade character varying(100),
  telefone character varying(12),
  "dtNascimento" date,
  CONSTRAINT pessoa_pkey PRIMARY KEY (cdpessoa)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE pessoa
  OWNER TO postgres;
